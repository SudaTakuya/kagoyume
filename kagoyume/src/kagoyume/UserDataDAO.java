package kagoyume;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import base.DBManager;

//DB関係の処理を行うクラス
public class UserDataDAO {

	public static UserDataDAO getInstance(){
        return new UserDataDAO();
    }

	//カートの中身の購入処理を行うメソッド
	public void insertBuy(int userID,ArrayList<ItemData> cart,int type) throws SQLException{

		Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("insert into buy_t(userID,itemCode,type,buyDate) values(?,?,?,?)");
            st.setInt(1,userID);
            st.setInt(3, type);
            st.setTimestamp(4,new Timestamp(System.currentTimeMillis()));

            for(ItemData id : cart){
            	st.setString(2, id.getCode());
            	st.executeUpdate();
            }

            System.out.println("Buy Complete!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

	}

	//ユーザーが購入した商品の商品コードを取得するメソッド
	public ArrayList<String> searchHistory(int userID) throws SQLException{
		Connection con = null;
        PreparedStatement st = null;
        ResultSet rset = null;
        ArrayList<String> historyCode = new ArrayList<>();
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("select itemCode from buy_t where userID=?");
            st.setInt(1, userID);

            rset = st.executeQuery();

            while(rset.next()){
            	historyCode.add(rset.getString("itemCode"));
            }

            return historyCode;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

	}

	//購入処理時にユーザーの合計購入金額を更新するメソッド
	public void updateTotal(int userID,int total) throws SQLException{
		Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("update user_t set total=total+? where userID=?");
            st.setInt(1, total);
            st.setInt(2, userID);

            st.executeUpdate();

            System.out.println("Total Update!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
	}

	//指定ユーザーの情報を取得するメソッド(存在しない場合はnull値のUserDataDTOが返される)
	public UserDataDTO login(UserDataDTO loginData) throws SQLException{
		Connection con = null;
        PreparedStatement st = null;
        ResultSet rset = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("select * from user_t where name=? and passward=? and deleteFlag!=1");
            st.setString(1, loginData.getName());
            st.setString(2, loginData.getPassward());

            rset = st.executeQuery();

            if(rset.next()){
            	//指定ユーザーが存在した場合は、残りのデータも格納する
				loginData.setUserID(rset.getInt("UserID"));
				loginData.setMail(rset.getString("mail"));
				loginData.setAddress(rset.getString("address"));
				loginData.setTotal(rset.getInt("total"));
				loginData.setNewDate(rset.getTimestamp("newDate"));

            }else{
            	//指定ユーザーが存在しない場合は、null値を代入する
            	loginData = null;
            }

            return loginData;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
	}

	//新規ユーザー情報をuser_tテーブルに挿入するメソッド
	public void insertUser(UserDataDTO udd) throws SQLException{
		Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("insert into user_t(name,passward,mail,address,total,newDate) "
            		+ "values(?,?,?,?,?,?)");
            st.setString(1, udd.getName());
            st.setString(2, udd.getPassward());
            st.setString(3, udd.getMail());
            st.setString(4, udd.getAddress());
            st.setInt(5, udd.getTotal());
            st.setTimestamp(6,new Timestamp(System.currentTimeMillis()));

            st.executeUpdate();

            System.out.println("New User!");

        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
	}

	//ユーザー情報の更新を行うメソッド
	//更新日時のTimestampを返す
	public Timestamp updateUser(UserDataDTO updateData) throws SQLException{
		Connection con = null;
        PreparedStatement st = null;

        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("update user_t set name=?,passward=?,mail=?,address=?,newDate=? where userID=?");
            st.setString(1, updateData.getName());
            st.setString(2, updateData.getPassward());
            st.setString(3, updateData.getMail());
            st.setString(4, updateData.getAddress());
            Timestamp updateTime = new Timestamp(System.currentTimeMillis());
            st.setTimestamp(5, updateTime);
            st.setInt(6, updateData.getUserID());

            st.executeUpdate();

            System.out.println("User Update!");
            return updateTime;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
	}

	//ユーザー情報の削除を行うメソッド(外部キーの制約により削除はできないので、deleteFlagを1に変更する)
	public void deleteUser(int deleteID) throws SQLException{
		Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("update user_t set deleteFlag=1 where userID=?");
            st.setInt(1, deleteID);

            st.executeUpdate();

            System.out.println("User Delete!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
	}

}
