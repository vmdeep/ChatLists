package vmdeep.chatlists.chat;

public class Message {

	String MemberName;
	String MessageText;
	long timestamp;

    public Message() //-------  Constructor
    {
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
		return (int) (System.currentTimeMillis() / 1000L);
	};

	public static void main(String[] args) {

		// TODO Auto-generated method stub*/
		// Message MyMessage=new Message();
		// System.out.println(MyMessage.timestamp);
	};
}
