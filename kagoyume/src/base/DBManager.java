package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBManager {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kagoyume_db","root","");
            return con;
        }catch(ClassNotFoundException e){
            throw new IllegalMonitorStateException("データベースに接続できませんでした");
        } catch (SQLException e) {
            throw new IllegalMonitorStateException("データベースに接続できませんでした");
        }
    }
}