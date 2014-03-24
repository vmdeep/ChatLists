package vmdeep.chatlists.chat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class MessageList {

	private int size;

	private ConcurrentLinkedDeque<Message> messages=new ConcurrentLinkedDeque<Message>();
	
	public MessageList(int capacity) {
		size=capacity;
		for(int i=0;i<size;i++){
			messages.add(null);
		}
	}
	
	public void pushMessage(Message m){
		messages.removeFirst();
		messages.add(m);
		
	}
	public Message[] getMessages(long timestamp){
		ArrayList<Message> result = new ArrayList<Message>();
		Iterator<Message> iter = messages.descendingIterator();
		while(iter.hasNext()){
			Message m = iter.next();
			if(m != null && m.getMessageTimeStamp() > timestamp){
				result.add(m);
			}else{
				break;
			}
		} 
		return (Message[]) result.toArray();
	}	
	public static void main(String[] args) {
		MessageList mList=new MessageList(100);
	}
}


