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

	public static void main(String[] args) {

		// TODO Auto-generated method stub*/
		// Message MyMessage=new Message();
		// MyMessage.UserName="Вася";
		// System.out.println(MyMessage.getMessageTimeStamp());
	};
}
