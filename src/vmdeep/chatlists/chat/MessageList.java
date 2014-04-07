package vmdeep.chatlists.chat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

import vmdeep.chatlists.message.EmptyMessage;
import vmdeep.chatlists.message.Message;
import vmdeep.chatlists.message.SystemMessage;
import vmdeep.chatlists.message.UserMessage;

public class MessageList {
	
	Object sync = new Object();

	private int size;

	private ConcurrentLinkedDeque<Message> messages=new ConcurrentLinkedDeque<Message>();
	
	public MessageList(int capacity) {
		size=capacity;
		for(int i=0;i<size;i++){
			messages.add(new EmptyMessage());
		}
	}
	
	public void pushMessage(Message m){
		messages.removeFirst();
		synchronized (sync) {
			messages.add(m);
			m.putMessageTimestamp();
		}
		
		
	}
	
	public Message[] getMessages(long timestamp){
		ArrayList<Message> result = new ArrayList<Message>();
		Iterator<Message> iter = messages.descendingIterator();
		while(iter.hasNext()){
			Message m = iter.next();
				if(m.getMessageTimestamp() > timestamp){
					result.add(m);
				}else{
					break;
				} 
		}		
		return (Message[]) result.toArray(new Message[0]);
	}
	
	public String toString() {
		StringBuilder mss=new StringBuilder();
		for(Message m: getMessages(0))
			mss.append(m.toString());
		return mss.toString();
	}
	
	public static void main(String[] args) {
		//MessageList mList=new MessageList(100);
		//TODO Все проверки в тесты!!!
	}
}


