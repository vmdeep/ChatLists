package vmdeep.chatlists.chat;

public class Message {

	private String UserName;
	private String MessageText;
	private long timestamp;

	public void setUserName(String str1) {
		UserName = str1;
	};

	public String getUserName() {
		return UserName;
	};

	private String MessageText;
	private long timestamp;
	private Member Member;   

    public Member getMember() {
		return Member;
	}

	public void setMember(Member member) {
		Member = member;
	}

	public Message() //-------  Constructor
    {    
    	timestamp =	(int) (System.currentTimeMillis() / 1000L);
    };
        

	public void setMessageText(String str1) {
		MessageText = str1;
	};

	public String getMessageText() {
		return MessageText;
	};

	public long getMessageTimeStamp() {
		
		//return (int) (System.currentTimeMillis() / 1000L); TIMESTAMP
		
		java.util.Date timestamp= new java.util.Date();
		return timestamp.getTime();
	};


		// java.util.Date timestamp= new java.util.Date();
		// return timestamp.getTime();
		return timestamp;
	};

	public static void main(String[] args) {

		// TODO Auto-generated method stub*/
		// Message MyMessage=new Message();
		// MyMessage.UserName="Вася";
		// System.out.println(MyMessage.getMessageTimeStamp());
	};

		// TODO Auto-generated method stub*/
		 //Member MyMember = new Member();
		 //MyMember.fullName="Рябов Дмитрий Викторович";
		 //MyMember.email="rdv.pvt@gmail.com";
		 //MyMember.nickName="Димон";
		 //Message MyMessage=new Message(MyMember);
		// System.out.println(MyMessage.Member.fullName);
		 //System.out.println(MyMessage.timestamp);
		 //System.out.println(MyMessage.getMessageTimeStamp());		 
	};
}
