package vmdeep.chatlists.chat;

public class Member {
	 String nickName;
	 String fullName;
	 public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getLastTimeStamp() {
		return lastTimeStamp;
	}
	public void setLastTimeStamp(long lastTimeStamp) {
		this.lastTimeStamp = lastTimeStamp;
	}
	String email;
	 long lastTimeStamp;	
}
