/**
 * 
 */
package vmdeep.chatlists.chat;
import vmdeep.chatlists.auth.User;
import vmdeep.chatlists.chat.Member;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

	@Test
	public void testMessage() {
		User MyUser = new User("а","б","c");
		Member MyMember = new Member(MyUser);
		Message MyMessage = new Message(MyMember, testMessage);
		assertEquals("Текст сообщения разный", testMessage,
				MyMessage.getMessageText());

	}

	@Test
	public void testGetMember() {
		User MyUser = new User("а","б","c");		
		Member MyMember = new Member(MyUser);
		Message MyMessage = new Message(MyMember, testMessage);
		assertEquals("Объекты member отличаются", MyMember,
				MyMessage.getMember());
	}

	@Test
	public void testSetMember() {
		User MyUser = new User("а","б","c");		
		Member MyMember = new Member(MyUser);
		Member MyMember2 = new Member(MyUser);
		Message MyMessage = new Message(MyMember, testMessage);
		MyMessage.setMember(MyMember2);
		assertEquals("Объекты member отличаются", MyMember2,
				MyMessage.getMember());

	}

	@Test
	public void testSetMessageText() {
		User MyUser = new User("а","б","c");		
		Member MyMember = new Member(MyUser);	
		Message MyMessage = new Message(MyMember, testMessage);
		MyMessage.setMessageText("Hello");
		assertEquals("Текст сообщения разный", "Hello",
				MyMessage.getMessageText());
	}

	@Test
	public void testGetMessageText() {
		User MyUser = new User("а","б","c");		
		Member MyMember = new Member(MyUser);	
		Message MyMessage = new Message(MyMember, testMessage);
		MyMessage.setMessageText("Hello");
		assertEquals("Текст сообщения разный", "Hello",
				MyMessage.getMessageText());
	}

	@Test
	public void testGetMessageTimeStamp() {
		long timestamp;		
		User MyUser = new User("а","б","c");		
		Member MyMember = new Member(MyUser);
		timestamp = System.currentTimeMillis() / 1000L;		
		Message MyMessage = new Message(MyMember, testMessage);
		MyMessage.setMessageTimeStamp();
		assertEquals("Значения времени класса больше или равно", MyMessage.getMessageTimeStamp(), timestamp); //? подкоркой чувствую, что здесь должно быть AssertFalse на сравнение больше и равно
	}

	/**
	 * Test method for {@link vmdeep.chatlists.chat.Message#IsNew(long)}.
	 */
	@Test
	public void testIsNew() {
		long timestamp;	
		User MyUser = new User("а","б","c");		
		Member MyMember = new Member(MyUser);
		timestamp = System.currentTimeMillis() / 1000L;		
		Message MyMessage = new Message(MyMember, testMessage);
		assertFalse(MyMessage.getMessageTimeStamp() > timestamp);
	}

}
