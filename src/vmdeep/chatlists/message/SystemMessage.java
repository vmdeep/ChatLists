package vmdeep.chatlists.message;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemMessage extends Message {
	private MessageAction action;

	public SystemMessage(){
		timestamp=System.currentTimeMillis();
	}
	
	public String toString(){
		return "SystemMessage: ["+new SimpleDateFormat("MM.dd.yyyy HH:mm:ss").format(new Date(timestamp))+"]"+action+":"+getMessageText();
	}
}
