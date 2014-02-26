package vmdeep.chatlists.chat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MessageList {
	private int capacity=20;
	private static int MIN_MESSAGE_COUNT=1;
	private static int MAX_MESSAGE_COUNT=100;

	private ConcurrentLinkedDeque<Message> messages=new ConcurrentLinkedDeque<Message>();
	
	{
		for(int i=0;i<capacity;i++){
			messages.add(null);
		}
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		if(capacity>=MIN_MESSAGE_COUNT && capacity<=MAX_MESSAGE_COUNT)
			this.capacity = capacity;
	}
	
	
	public void pushMessage(Message m){
		messages.add(m);
		while(messages.size()>capacity)
			messages.removeFirst();
	}
	public Message getLastMessage(){
		return messages.getLast();
		
	}
//	public Message[] getAllMessage(){
//		return messages.toArray
//	}
	




	public static void main(String[] args) {

	}

}
