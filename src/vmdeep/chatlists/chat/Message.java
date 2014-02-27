package vmdeep.chatlists.chat;

public class Message {

	private String MemberName;
	private String MessageText;
	private long timestamp;
	private Member Member;   

    public Message(Member objMember) //-------  Constructor
    {    
    	Member = objMember;
    	timestamp =	(int) (System.currentTimeMillis() / 1000L);
    };
        
	public int setMemberName(String str1) {
		MemberName = str1;
		return 1;
	};

	public String getMemberName() {
		return MemberName;
	};

	public int setMessageText(String str1) {
		MessageText = str1;
		return 1;
	};

	public String getMessageText() {
		return MessageText;
	};

	public long getMessageTimeStamp() {

		// java.util.Date timestamp= new java.util.Date();
		// return timestamp.getTime();
		return timestamp;
	};

	public static void main(String[] args) {

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
