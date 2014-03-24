package vmdeep.chatlists.chat;

import vmdeep.chatlists.auth.User;

public class Room {
	private MemberList Memebers;
	private MessageList Messages;
	RoomConfiguration Config;
	
	public Room(RoomConfiguration config) {
		Memebers  = new MemberList();
		Messages = new MessageList(config.MESSAGE_LIST_SIZE);
	}
	
	public Boolean login(User u) {
		return null;	
	}
	
	public Boolean logout(User u) {
		return null;
		
	}
	
	
	
}
