package vmdeep.chatlists.chat;

import vmdeep.chatlists.auth.User;

public class Member {
	 User user;
	 long lastTimeStamp = 0;	
	 Boolean adminRole = false;
		 
	 public Member(User u) {
		this.user = u;
	}

	 public Boolean getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(Boolean adminRole) {
		this.adminRole = adminRole;
	}

	 public String getNickName() {
		return user.nickName;
	}

	public String getFullName() {
		return user.fullName;
	}

	public String getEmail() {
		return user.email;
	}
	
	public long getLastTimeStamp() {
		return lastTimeStamp;
	}
	
	public void setLastTimeStamp(long lastTimeStamp) {
		this.lastTimeStamp = lastTimeStamp;
	}

}
