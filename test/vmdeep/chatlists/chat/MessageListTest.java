package vmdeep.chatlists.chat;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import vmdeep.chatlists.auth.User;
import vmdeep.chatlists.message.Message;
import vmdeep.chatlists.message.UserMessage;

public class MessageListTest {

	@Test
	public void testMessageList() {
		//fail("Not yet implemented");
		MessageList mList=new MessageList(100);
		assertNotEquals(null,  mList);
	}

	private void fillMessages(MessageList mList){
		for(int i=0;i<10;i++){
			User u=new User("nick"+i, "fullname"+i, "mail"+i);
			Member member=new Member(u);
			
			Message m=new UserMessage(member,"text"+i);
			mList.pushMessage(m);
		}
		
	}
	@Test
	public void testPushMessage() {
		MessageList mList=new MessageList(100);
		fillMessages(mList);
	}

	@Test
	public void testGetMessages() {
		//fail("Not yet implemented");
		
	}

	@Test
	public void testToString(){
		MessageList mList=new MessageList(100);
		fillMessages(mList);
		System.out.println(mList.toString());
	}
}
