package vmdeep.chatlists.chat;

import vmdeep.chatlists.auth.User;
import vmdeep.chatlists.types.MessageType;

public class Message {

	private String text="";
	private long timestamp = -1L;
	private Member member;
	private MessageType type=MessageType.USER;

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public Message(Member member, String text) // ------- Constructor
	{
		this.text = text;
		this.member = member;
	};
	
	public Message() // ------- Constructor
	{

	};

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void setMessageText(String text) {
		this.text = text;
	};

	public String getMessageText() {
		return text;
	};

	public long getMessageTimeStamp() {

		return timestamp;
	};
	
	public void setMessageTimeStamp() {
		
	timestamp = System.currentTimeMillis();
	
	};
	

	public boolean IsNew(long timestamp) {

		return this.timestamp > timestamp;
	};
	
	
	public static void main(String[] args) {
		Member MyMember = new Member(new User("Димон","Рябов Дмитрий Викторович","rdv.pvt@gmail.com"));
		Message MyMessage=new Message(MyMember,"Hello World!!!");
		System.out.println(MyMessage.getMessageTimeStamp());
	};
}
