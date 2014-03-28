package vmdeep.chatlists.message;

import java.text.SimpleDateFormat;
import java.util.Date;

import vmdeep.chatlists.chat.Member;

public class UserMessage extends Message {
	private Member member;
	
	public UserMessage(Member member, String text) // ------- Constructor
	{
		this.text=text;
		this.member = member;
	}
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	public String toString(){
		return "UserMessage: ["+new SimpleDateFormat("MM.dd.yyyy HH:mm:ss").format(new Date(getMessageTimestamp()))+"]"
				+member.getNickname()+": "+getMessageText();
	}
	
	public static void main(String[] args) {
//		Member MyMember = new Member(new User("Димон","Рябов Дмитрий Викторович","rdv.pvt@gmail.com"));
//		Message MyMessage=new Message(MyMember,"Hello World!!!");
//		System.out.println(MyMessage.getMessageTimeStamp());
	};}
 