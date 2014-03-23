package vmdeep.chatlists.chat;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class MessageListTest {

	@Test
	public void testMessageList() {
		//fail("Not yet implemented");
		MessageList mList=new MessageList("Комната1", 100);
		assertNotEquals(null,  mList);
	}

	@Test
	public void testPushMessage() {
		MessageList mList=new MessageList("Комната1", 100);
		for(int i=0;i<10;i++){
			Member member=new Member();
			member.setNickName("Bill"+i);
			member.setFullName("Bill Clinton"+i);
			member.setEmail("bill"+i+"@gmail.com");
			member.setLastTimeStamp(System.currentTimeMillis() / 1000L);
			
			Message m=new Message(member,"text"+i);
			mList.pushMessage(m);
		}
	}

	@Test
	public void testGetMessages() {
		fail("Not yet implemented");
	}

}
