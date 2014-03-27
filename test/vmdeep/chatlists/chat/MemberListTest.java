package vmdeep.chatlists.chat;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vmdeep.chatlists.auth.User;

public class MemberListTest {

	MemberList mList;
	Member m;
	User u;
	
	@Before
	public void init() {
		mList = new MemberList();
		u = new User("evgen", "Korchak Evgeny", "ochelot@mail.ru");
		m = new Member(u);
	}
	
	@Test
	public void testPutAndGet() {
		mList.put(m);
		assertNotNull(mList.get("evgen"));
	}
		
			
	@Test	
	public void testIsNickName() {
		mList.put(m);
		assertTrue(mList.isNickName("evgen"));	
	}
		
	@Test
	public void testIsMember() {		
		mList.put(m);
		assertTrue(mList.isMember(m));		
	}
		
	@Test
	public void testRemove() {
		mList.put(m);
		mList.remove("evgen");
		assertTrue(!mList.isNickName("evgen"));			
	}
		
	@Test
	public void TestGetLastTimeStamp() {
		mList.put(m);
		assertTrue(mList.getLastTimeStamp("evgen") >= 0);
	}
	
	@Test
	public void testSetLastTimeStamp() {
		mList.put(m);
		mList.setLastTimeStamp("evgen", 1000);
		assertTrue(mList.getLastTimeStamp("evgen") == 1000);
	}
		
	@Test
	public void testToString() {
		mList.put(m);
		assertTrue(mList.toString().length() > 0);	
	}
	
	@Test
	public void testToArray() {
		mList.put(m);
		assertTrue(mList.toArray().length == 1);	
	}
	
}
