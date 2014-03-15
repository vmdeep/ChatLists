package vmdeep.chatlists.chat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <h1>Список пользователей onLine</h1>
 * 
 * @author Корчак Евгений
 * @version 0.000001
*/


public class MemberList {
	private String id;
	private ConcurrentHashMap<String, Member> members; 
	
	public MemberList(String name) {
		id = name;
		members = new ConcurrentHashMap<String, Member>();
	}
	
	public String id() {
		return id;
	}
	
	public int size() {
		return members.size();
	}
	
	/**
	  * <p>Добавить в список.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @param member Данные о пользователе
	  * @return null, если пользователь уже есть в таблице или ошибка добавления, Member, если удачно
	  */
	public Member put(String nickName, Member member) {
		if ( (nickName == null) || (member == null) || (members.containsKey(nickName) == true) )
			return null;
		return members.put(nickName, member);
	}
	
	/**
	  * <p>Проверка существования пользователя в списке.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @return true, пользователь есть в таблице, false, если нет
	  */
	public boolean isNickName(String nickName) {
		if ( nickName == null )
			return false;
		return members.containsKey(nickName);
	}
	
	/**
	  * <p>Проверка существования данных о пользователе в списке.</p>
	  *
	  * @param member данные для проверки
	  * @return true, данные есть в таблице, false, если нет
	  */
	public boolean isMember(Member member) {
		if ( member == null )
			return false;
		return members.containsValue(member);
	}
	
	/**
	  * <p>Удалить из списка.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @return null, ошибка удаления, и Member, если удачно
	  */
	public Member remove(String nickName) {
		if ( nickName == null )
			return null;
		return members.remove(nickName);
	}
	
	/**
	  * <p>Возвращает массив Member.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @return Массив типа Member
	  */
	public Member[] getMembers() {
		ArrayList<Member> result = new ArrayList<Member>();
		Iterator<String> key = members.keySet().iterator();

		while ( key.hasNext() ) {
		  String nickName = key.next();
		  result.add(members.get(nickName));
		}
		
		return (Member[]) result.toArray(new Member[result.size()]);
	}	
	
	/**
	  * <p>Возвращает TimeStamp последнего прочитаного сообщения.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @return -1, если ошибка или пользователя не существует, и long TimeStamp, если удачно
	  */
	public long getLastMessage(String nickName) {
		if ( nickName != null ) {
			Member m = members.get(nickName);
			if ( m != null )
				return m.lastMessage;
		}
		return -1L;
	}
	
	/**
	  * <p>Устанавливает TimeStamp последнего прочитаного сообщения.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @param timestamp long TimeStamp последнего прочитаного сообщения.
	  * @return -1, если ошибка или пользователя не существует, и long TimeStamp, если удачно
	  */
	public long setLastMessage(String nickName, long timestamp) {
		if ( nickName != null ) {
			Member m = members.get(nickName);
			if ( m != null ) {
				m.lastMessage = timestamp;
				if ( members.put(nickName, m) != null)
					return m.lastMessage; 
			}
		}
		return -1L;		
	}
	
	public void printConsoleMembers() {
		Iterator<String> key = members.keySet().iterator();

		while ( key.hasNext() ) {
		  String nickName = key.next();
		  System.out.println("[nickName: "   + members.get(nickName).nickName + "]");
		  System.out.println("fullName: "    + members.get(nickName).fullName);
		  System.out.println("email: "       + members.get(nickName).email);
		  System.out.println("lastMessage: " + members.get(nickName).lastMessage);
		}
	}
	
	public void printConsoleMembers(Member[] members) {
		for ( Member m : members ) {
		  System.out.println("[nickName: "   + m.nickName + "]");
		  System.out.println("fullName: "    + m.fullName);
		  System.out.println("email: "       + m.email);
		  System.out.println("lastMessage: " + m.lastMessage);
		}
	}
	
	
	/*
	public static void main(String[] args) {
		MemberList m=new MemberList("MemberList");
		System.out.println("id: " + m.id());
		
		Member n1=new Member();
		n1.nickName="n1";
		n1.lastMessage = 100;

		Member n2=new Member();
		n2.nickName="n2";
		n2.lastMessage = 200;
		
		Member n3=new Member();
		n3.nickName="n3";
		n3.lastMessage = 300;
		
		Member n4=new Member();
		n4.nickName="n4";
		n4.lastMessage = 400;
		
		m.put(null, n1);
		m.put("n1", n1);
		m.put("n1", n4); //!!!
		m.put("n10", null); //!!!
		m.put("n2", n2);
		m.put("n3", n3);
		m.put("n4", n4);
		
		//m.printConsoleMembers();
		
		m.setLastMessage("n33", 1000);
		
		m.remove(null);
		m.remove("n1");
		//m.printConsoleMembers();
		
		m.isNickName(null);
		m.getLastMessage(null);
		
		m.setLastMessage(null, 1);
		
		//System.out.println("n33 lastMessage: " + m.getLastMessage("n33"));
		//System.out.println("n2 lastMessage: " + m.getLastMessage(null));

		m.printConsoleMembers(m.getMembers());
		
	};
	*/
}
