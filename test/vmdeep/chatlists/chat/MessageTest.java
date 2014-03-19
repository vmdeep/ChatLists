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

	// MyMember.email=testEmail;
	// MyMember.fullName=testFullname;
	// MyMember.nickName=testNickName;

	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#Message()}.
	 */
	@Test
	public void testMessage() {
		Member MyMember = new Member();
		Message MyMessage = new Message(MyMember, testMessage);
		assertEquals("Текст сообщения одинаковый", testMessage,
				MyMessage.getMessageText());

	}

	@Test
	public void testGetMember() {
		Member MyMember = new Member();
		Message MyMessage = new Message(MyMember, testMessage);
		assertEquals("Объект member один и тот же", MyMember,
				MyMessage.getMember());
	}

	@Test
	public void testSetMember() {
		Member MyMember = new Member();
		Member MyMember2 = new Member();
		Message MyMessage = new Message(MyMember, testMessage);
		MyMessage.setMember(MyMember2);
		assertEquals("Объект member один и тот же", MyMember2,
				MyMessage.getMember());

	}

	@Test
	public void testSetMessageText() {
		Member MyMember = new Member();		
		Message MyMessage = new Message(MyMember, testMessage);
		MyMessage.setMessageText("Hello");
		assertEquals("Текст сообщения одинаковый", "Hello",
				MyMessage.getMessageText());
	}

	@Test
	public void testGetMessageText() {
		Member MyMember = new Member();		
		Message MyMessage = new Message(MyMember, testMessage);
		MyMessage.setMessageText("Hello");
		assertEquals("Текст сообщения одинаковый", "Hello",
				MyMessage.getMessageText());
	}

	@Test
	public void testGetMessageTimeStamp() {
		long timestamp;		
		Member MyMember = new Member();
		timestamp = System.currentTimeMillis() / 1000L;		
		Message MyMessage = new Message(MyMember, testMessage);
		assertEquals("Значения времени класса больше или равно", MyMessage.getMessageTimeStamp(), timestamp); //? подкоркой чувствую, что сдесь должно быть AssertFalse на сравнение больше и равно
	}

	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#IsNew(long)}.
	 */
	@Test
	public void testIsNew() {
		long timestamp;	
		Member MyMember = new Member();
		timestamp = System.currentTimeMillis() / 1000L;		
		Message MyMessage = new Message(MyMember, testMessage);
		assertFalse(MyMessage.getMessageTimeStamp() > timestamp);
	}

}
