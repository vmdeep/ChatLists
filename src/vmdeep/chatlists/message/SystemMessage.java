package vmdeep.chatlists.message;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemMessage extends Message {
	private MessageAction action;

	public SystemMessage(){
		super.setMessageTimestamp(System.currentTimeMillis());
	}
	
	public String toString(){
		return "SystemMessage: ["+new SimpleDateFormat("MM.dd.yyyy HH:mm:ss").format(new Date(super.getMessageTimestamp()))+"]"+action+":"+super.getMessageText();
	}
}
