package vmdeep.chatlists.chat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <h1>Список пользователей onLine</h1>
 * 
 * @author Корчак Евгений
 * @version 0.2
*/


public class MemberList {
	private ConcurrentHashMap<String, Member> members; 
	
	public MemberList() {
		members = new ConcurrentHashMap<String, Member>();
	}
	
	public int size() {
		return members.size();
	}
	
	/**
	  * <p>Добавить в список.</p>
	  *
	  * @param member Данные о пользователе
	  */
	public void put(Member member) {
		if ( members.containsKey(member.getNickName()) != true )
			members.put(member.getNickName(), member);
	}
	
	/**
	  * <p>Возвращает Member.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @return null, ошибка, и Member, если удачно
	  */
	public Member get(String nickName) {
		return members.get(nickName);
	}	
	
	/**
	  * <p>Проверка существования пользователя в списке.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @return true, пользователь есть в таблице, false, если нет или ошибка
	  */
	public boolean isNickName(String nickName) {
		return members.containsKey(nickName);
	}
	
	/**
	  * <p>Проверка существования данных о пользователе в списке.</p>
	  *
	  * @param member данные для проверки
	  * @return true, данные есть в таблице, false, если нет
	  */
	public boolean isMember(Member member) {		
		return members.containsValue(member);
	}
	
	/**
	  * <p>Удалить из списка.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  */
	public void remove(String nickName) {
		members.remove(nickName);
	}
	
	/**
	  * <p>Возвращает массив Member.</p>
	  *
	  * @return Массив типа Member
	  */
	public Member[] toArray() {
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
	  * @return -1L, если ошибка или пользователя не существует, и long TimeStamp, если удачно
	  */
	public long getLastTimeStamp(String nickName) {
		Member m = members.get(nickName);
		if ( m != null )
			return m.lastTimeStamp;
		return -1L;
	}
	
	/**
	  * <p>Устанавливает TimeStamp последнего прочитаного сообщения.</p>
	  *
	  * @param nickName Ник пользователя (ключ в таблице)
	  * @param TimeStamp последнего прочитаного сообщения.
	  */
	public void setLastTimeStamp(String nickName, long timestamp) {
		Member m = members.get(nickName);
		if ( m != null ) 	
		  m.lastTimeStamp = timestamp;
	}
	
	public String toString() {
		Iterator<String> key = members.keySet().iterator();
		StringBuilder str = new StringBuilder();
		
		while ( key.hasNext() ) {
		  String nickName = key.next();
		  str.append("[nickName: "   + members.get(nickName).getNickName() + "; ");
		  str.append("fullName: "    + members.get(nickName).getFullName() + "; ");
		  str.append("email: "       + members.get(nickName).getEmail()    + "; ");
		  str.append("lastMessage: " + members.get(nickName).lastTimeStamp + "]\n");
		}
		
		return str.toString();
	}
		
	 /* public static void main(String[] args) { }; */
}
