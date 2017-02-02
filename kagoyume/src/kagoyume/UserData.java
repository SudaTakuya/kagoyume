package kagoyume;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

//各画面表示などに用いるユーザー情報を扱うJavaBeans
public class UserData implements Serializable{

	private int userID;
	private String name;
	private String passward;
	private String mail;
	private String address;
	private int total;
	private Date newDate;

	public UserData(){
		this.userID = 0;
		this.name = "";
		this.passward = "";
		this.mail = "";
		this.address = "";
		this.total = 0;
		this.newDate = null;
	}

	public int getUserID(){
		return this.userID;
	}

	public void setUserID(int userID){
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.trim().equals("")){
			this.name = "";
		}else{
			this.name = name;
		}
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		if(passward.trim().equals("")){
			this.passward = "";
		}else{
			this.passward = passward;
		}
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		if(mail.trim().equals("")){
			this.mail = "";
		}else{
			this.mail = mail;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if(address.trim().equals("")){
			this.address = "";
		}else{
			this.address = address;
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Date getNewDate() {
		return newDate;
	}

	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}

	//UserDataをUserDataDTOに変換するメソッド
	public UserDataDTO UDToUDD(){

		UserDataDTO udd = new UserDataDTO();

		udd.setUserID(this.userID);
		udd.setName(this.name);
		udd.setPassward(this.passward);
		udd.setMail(this.mail);
		udd.setAddress(this.address);
		udd.setTotal(this.total);
		if(this.newDate != null){
			udd.setNewDate(new Timestamp(this.newDate.getTime()));
		}

		return udd;
	}

	//UserDataDTOをUserDAtaに変換するメソッド
	public void UDDToUD(UserDataDTO udd){

		this.setUserID(udd.getUserID());
		this.setName(udd.getName());
		this.setPassward(udd.getPassward());
		this.setMail(udd.getMail());
		this.setAddress(udd.getAddress());
		this.setTotal(udd.getTotal());
		if(udd.getNewDate() != null){
			this.setNewDate(new Date(udd.getNewDate().getTime()));
		}
	}


	//入力内容の不足項目を表す文字列を取得するメソッド
	public String checkForm(){
		StringBuilder sb = new StringBuilder();

		if(name.equals("")){
			sb.append("名前 ");
		}

		if(passward.equals("")){
			sb.append("パスワード ");
		}

		if(mail.equals("")){
			sb.append("メールアドレス ");
		}

		if(address.equals("")){
			sb.append("住所 ");
		}

		String str = sb.toString();
		return str;
	}


}
