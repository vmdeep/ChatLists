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
	
	public MemberList() {
		this("MemberList");
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
	  * @return null, если пользователь уже есть в таблице или ошибка, Member, если удачно
	  */
	public Member put(String nickName, Member member) {
		try {
			if ( members.containsKey(nickName) != true )
				return members.put(nickName, member);
		} catch(NullPointerException e ) {
			//System.out.println("Ошибка: Неверные значения put(nickName, member) - " + e);
		  }
		return null;		
	}
	
	/**
	  * <p>Проверка существования пользователя в списке.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @return true, пользователь есть в таблице, false, если нет или ошибка
	  */
	public boolean isNickName(String nickName) {
		try {
			return members.containsKey(nickName);
		} catch(NullPointerException e ) {
			//System.out.println("Ошибка: Неверные значения isNickName(nickName) - " + e);
		  }
		return false;
	}
	
	/**
	  * <p>Проверка существования данных о пользователе в списке.</p>
	  *
	  * @param member данные для проверки
	  * @return true, данные есть в таблице, false, если нет
	  */
	public boolean isMember(Member member) {		
		try {
			return members.containsValue(member);
		} catch(NullPointerException e ) {
			//System.out.println("Ошибка: Неверные значения isMember(member) - " + e);
		  }
		return false;
	}
	
	/**
	  * <p>Удалить из списка.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @return null, ошибка удаления, и Member, если удачно
	  */
	public Member remove(String nickName) {
		try {
			return members.remove(nickName);
		} catch(NullPointerException e ) {
			//System.out.println("Ошибка: Неверные значения remove(nickName) - " + e);
		  }
		return null;
	}
	
	/**
	  * <p>Возвращает массив Member.</p>
	  *
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
	  * <p>Возвращает Member.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @return null, ошибка, и Member, если удачно
	  */
	public Member getMember(String nickName) {
		try {
			return members.get(nickName);
		} catch(NullPointerException e ) {
			//System.out.println("Ошибка: Неверные значения getMember(nickName) - " + e);
		  }
		return null;
	}	
	
	/**
	  * <p>Возвращает TimeStamp последнего прочитаного сообщения.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @return -1, если ошибка или пользователя не существует, и long TimeStamp, если удачно
	  */
	public long getLastMessage(String nickName) {
		try {
			return members.get(nickName).lastMessage;
		}
		catch(NullPointerException e ) {
			//System.out.println("Ошибка: Неверные значения getLastMessage(nickName) - " + e);
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
		
		try {
			Member m = members.get(nickName);
			m.lastMessage = timestamp;
			members.put(nickName, m);
			return m.lastMessage; 
			
		} catch(NullPointerException e ) {
			//System.out.println("Ошибка: Неверные значения setLastMessage(nickName, timestamp) - " + e);
		  }
		return -1L;		
	}
	
	public String toString() {
		Iterator<String> key = members.keySet().iterator();
		StringBuilder str = new StringBuilder();
		
		while ( key.hasNext() ) {
		  String nickName = key.next();
		  str.append("[nickName: "   + members.get(nickName).nickName + "; ");
		  str.append("fullName: "    + members.get(nickName).fullName + "; ");
		  str.append("email: "       + members.get(nickName).email    + "; ");
		  str.append("lastMessage: " + members.get(nickName).lastMessage + "]\n");
		}
		
		return str.toString();
	}
		
	
	// public static void main(String[] args) { }; 
}
