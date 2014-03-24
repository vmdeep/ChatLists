package vmdeep.chatlists.chat;

import vmdeep.chatlists.auth.User;

public class Message {

	private String text;
	private long timestamp = -1L;
	private Member member;

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
		
	timestamp = (System.currentTimeMillis() / 1000L);
	
	};
	

	public boolean IsNew(long timestamp) {

		return this.timestamp < timestamp;
	};
	
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub*/
		 Member MyMember = new Member(new User("Димон","Рябов Дмитрий Викторович","rdv.pvt@gmail.com"));
		 Message MyMessage=new Message(MyMember,"Hello World!!!");
		//if(MyMessage.IsNew(System.currentTimeMillis() / 1000L))
		//{
		// System.out.println("Новое сообщение");
		//}
		// else System.out.println("Новое сообщение"); 
		 // System.out.println(MyMessage.Member.fullName);
		// System.out.println(MyMessage.timestamp);
		 System.out.println(MyMessage.getMessageTimeStamp());
	};
}
