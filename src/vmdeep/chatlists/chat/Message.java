package vmdeep.chatlists.chat;

public class Message {
	
	String 	UserName;
	String 	MessageText;
	long 	timestamp;
	public int setUserName(String str1) {
		UserName = str1;
		return 1;
	};
	public String getUserName() {
		return UserName;
	};
	public int setMessageText(String str1) {
		MessageText = str1;
		return 1;
	};
	public String getMessageText() {
		return MessageText;
	};	
	public long getMessageTimeStamp() {
		java.util.Date timestamp= new java.util.Date();	
		return timestamp.getTime();
	};	

	
	
	public static void main(String[] args) {
			
   // TODO Auto-generated method stub*/
	//Message	MyMessage=new Message();
	//MyMessage.UserName="Вася";
    //System.out.println(MyMessage.getMessageTimeStamp());
    };	
}

