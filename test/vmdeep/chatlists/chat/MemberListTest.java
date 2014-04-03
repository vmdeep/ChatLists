package vmdeep.chatlists.chat;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vmdeep.chatlists.auth.User;
import vmdeep.chatlists.exceptions.MemberExistException;

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
		try {
			mList.put(m);
		} catch (MemberExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(mList.get("evgen"));
	}
		
			
	@Test	
	public void testIsNickName() {
		try {
			mList.put(m);
		} catch (MemberExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(mList.isNickName("evgen"));	
	}
		
	@Test
	public void testIsMember() {		
		try {
			mList.put(m);
		} catch (MemberExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(mList.isMember(m));		
	}
		
	@Test
	public void testRemove() {
		try {
			mList.put(m);
		} catch (MemberExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mList.remove("evgen");
		assertTrue(!mList.isNickName("evgen"));
	}
		
	@Test
	public void TestGetLastTimeStamp() {
		try {
			mList.put(m);
		} catch (MemberExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(mList.getLastTimeStamp("evgen") >= 0);
	}
	
	@Test
	public void testSetLastTimeStamp() {
		try {
			mList.put(m);
		} catch (MemberExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mList.setLastTimeStamp("evgen", 1000);
		assertTrue(mList.getLastTimeStamp("evgen") == 1000);
	}
		
	@Test
	public void testToString() {
		try {
			mList.put(m);
		} catch (MemberExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(mList.toString().length() > 0);	
	}
	
	@Test
	public void testToArray() {
		try {
			mList.put(m);
		} catch (MemberExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(mList.toArray().length == 1);	
	}
	
}
