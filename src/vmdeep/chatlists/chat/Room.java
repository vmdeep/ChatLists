package vmdeep.chatlists.chat;

import vmdeep.chatlists.auth.User;

public class Room {
	private MemberList members;
	private MessageList messages;
	RoomConfiguration config;

	public Room(RoomConfiguration config) {
		members = new MemberList();
		messages = new MessageList(config.MESSAGE_LIST_SIZE);
	}
	
//Создание комнаты с администратором и при необходимости с доступом по паролю
	public Room(Member member, String password) {
		config = new RoomConfiguration(member, password);
		members = new MemberList();
		messages = new MessageList(config.MESSAGE_LIST_SIZE);
	}

	public Boolean login(User u) {
		return null;
	}

	public Boolean logout(User u) {
		return null;

	}

}
