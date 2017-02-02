package kagoyume;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

//DBアクセスに用いるユーザー情報を格納するクラス
public class UserDataDTO implements Serializable {

	private int userID;
	private String name;
	private String passward;
	private String mail;
	private String address;
	private int total;
	private Timestamp newDate;
	private int deleteFlag;

	public UserDataDTO(){
		this.userID = 0;
		this.name = "";
		this.passward = "";
		this.mail = "";
		this.address = "";
		this.total = 0;
		this.newDate = null;
		this.deleteFlag = 0;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public void setNewDate(Timestamp newDate) {
		this.newDate = newDate;
	}

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
