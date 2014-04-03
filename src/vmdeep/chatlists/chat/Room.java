package vmdeep.chatlists.chat;

import vmdeep.chatlists.exceptions.MemberExistException;
import vmdeep.chatlists.message.MessageAction;
import vmdeep.chatlists.message.SystemMessage;

public class Room {
	private MemberList members;
	private MessageList messages;
	private RoomConfiguration config;

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

	public Boolean login(Member m) throws MemberExistException {
		members.put(m);
		SystemMessage sys = new SystemMessage();
		sys.setMessageText("Болтун "+m.getNickname()+" вошел в чат");
		sys.setAction(MessageAction.LoginMember);
		messages.pushMessage(sys);
		return true;
	}

	public Boolean logout(Member m) {
		members.remove(m.getNickname());
		return true;

	}

}
