package vmdeep.chatlists.chat;

public class RoomConfiguration {
	public int MESSAGE_LIST_SIZE = 100;
	public String ROOM_NAME = "Default Name";
	private Member owner; // Как на счет добавить создателя комнаты, с правами
							// админа?
	private String password = null; // А также пароль для доступа в комнату?

	public RoomConfiguration (Member member, String password)
	{
		setOwnerRoom(member);
		setPasswordRoom(password);
	}
	
	public void setOwnerRoom(Member ow) {
		this.owner = ow;
	}

	public void setPasswordRoom(String p) {
		this.password = p;
	}
}
