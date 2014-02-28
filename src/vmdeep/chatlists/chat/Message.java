package vmdeep.chatlists.chat;

public class Message {

	private String text;
	private long timestamp;
	private Member member;

	public Message() // ------- Constructor
	{
		timestamp = (System.currentTimeMillis() / 1000L);
	};

	public Message(Member member, String text) // ------- Constructor
	{
		this.text = text;
		this.member = member;
		timestamp = (System.currentTimeMillis() / 1000L);
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

	public boolean IsNew(long timestamp) {

		return this.timestamp < timestamp;
	};
	
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub*/
		// Member MyMember = new Member();
		// MyMember.fullName="Рябов Дмитрий Викторович";
		// MyMember.email="rdv.pvt@gmail.com";
		// MyMember.nickName="Димон";
		// Message MyMessage=new Message(MyMember,"Hello World!!!");
		//if(MyMessage.IsNew(System.currentTimeMillis() / 1000L))
		//{
		// System.out.println("Новое сообщение");
		//}
		// else System.out.println("Новое сообщение"); 
		 // System.out.println(MyMessage.Member.fullName);
		// System.out.println(MyMessage.timestamp);
		// System.out.println(MyMessage.getMessageTimeStamp());
	};
}
