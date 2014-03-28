package vmdeep.chatlists.chat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class MessageList {

	private int size;

	private ConcurrentLinkedDeque<Message> messages=new ConcurrentLinkedDeque<Message>();
	
	public MessageList(int capacity) {
		size=capacity;
		for(int i=0;i<size;i++){
			messages.add(new Message());
		}
	}
	
	public void pushMessage(Message m){
		messages.removeFirst();
		m.setMessageTimeStamp();
		messages.add(m);
		
	}
	public Message[] getMessages(long timestamp){
		ArrayList<Message> result = new ArrayList<Message>();
		Iterator<Message> iter = messages.descendingIterator();
		while(iter.hasNext()){
			Message m = iter.next();
			if(m.getMessageTimeStamp() > timestamp){
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
			mss.append("["+new SimpleDateFormat("MM.dd.yyyy HH:mm:ss").format(new Date(m.getMessageTimeStamp()))+"]"
						+m.getMember().getNickname()+": "+m.getMessageText()+"\r\n");
		return mss.toString();
	}
	public static void main(String[] args) {
		MessageList mList=new MessageList(100);
	}
}


