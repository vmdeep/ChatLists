/**
 * 
 */
package vmdeep.chatlists.chat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;

/**
 * @author Администратор
 *
 */
public class MessageTest {
	String testEmail = "test@test.ru";
	String testMessage = "Тестовое сообщение!";
	String testFullname = "Вася Пупкин";
	String testNickName = "}|{O|nOPA3PbIBATEJIb";
//	MyMember.email=testEmail;
//	MyMember.fullName=testFullname;
//	MyMember.nickName=testNickName;
	
		
	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#Message()}.
	 */
	@Test
	public void testMessage() {
		Member MyMember = new Member();	
		Message MyMessage = new Message(MyMember,testMessage);
		assertEquals("Текст сообщения одинаковый",testMessage,MyMessage.getMessageText());
		
	}

	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#Message(vmdeep.chatlists.chat.Member, java.lang.String)}.
	 */
	@Test
	public void testMessageMemberString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#getMember()}.
	 */
	@Test
	public void testGetMember() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#setMember(vmdeep.chatlists.chat.Member)}.
	 */
	@Test
	public void testSetMember() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#setMessageText(java.lang.String)}.
	 */
	@Test
	public void testSetMessageText() {
		Message MyMessage2 = new Message();
		MyMessage2.setMessageText("Hello");
		assertEquals("Текст сообщения одинаковый","Hello",MyMessage2.getMessageText());
	}

	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#getMessageText()}.
	 */
	@Test
	public void testGetMessageText() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#getMessageTimeStamp()}.
	 */
	@Test
	public void testGetMessageTimeStamp() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#IsNew(long)}.
	 */
	@Test
	public void testIsNew() {
		Member MyMember = new Member();
		Message MyMessage = new Message(MyMember,testMessage);		
		assertFalse(MyMessage.getMessageTimeStamp()<MyMessage.timestamp);  		
	}

}
