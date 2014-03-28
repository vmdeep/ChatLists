package vmdeep.chatlists.message;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmptyMessage extends Message {
	public EmptyMessage(){
		timestamp=-1;
	}
	public String toString(){
		return "EmptyMessage: ["+new SimpleDateFormat("MM.dd.yyyy HH:mm:ss").format(new Date(timestamp))+"]"+text;
	}
}
