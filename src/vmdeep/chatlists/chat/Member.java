package vmdeep.chatlists.chat;

import vmdeep.chatlists.auth.User;

public class Member {
	 User user;
	 long lastTimeStamp = 0;
	 Boolean adminRole = false;
	 String nickname;
		 
	 public Member(User u) {
		this.user = u;
		nickname=u.nickname;
	}

	 public Boolean getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(Boolean adminRole) {
		this.adminRole = adminRole;
	}

	 public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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
