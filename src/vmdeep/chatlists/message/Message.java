package vmdeep.chatlists.message;


public abstract class Message {

	protected String text="";
	protected long timestamp;

	public void setMessageText(String text) {
		this.text = text;
	}

	public String getMessageText() {
		return text;
	}

	public long getMessageTimestamp() {

		return timestamp;
	}

	public void setMessageTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public void putMessageTimestamp() {
		this.timestamp = System.currentTimeMillis();

	}

	public boolean IsNew(long timestamp) {

		return this.timestamp > timestamp;
	}
}
