package vmdeep.chatlists.auth;

import java.util.Date;
import java.util.Random;

public class User {
	
		public final String fullName;
		public final String email;
		public final String nickname;
		public int sex;		
		public Date birthDate; 
		public boolean showDate; //Показывать ль дату рождения в профиле
		public boolean aproove;  //учетная запись подтверждена (email/телефон)
		public String password;
		public boolean banned;
		public boolean changeUser; //флаг изменения параметров
		
		public User(String nick, String fullname,  String mail) {
			fullName = fullname;
			email = mail;
			nickname = nick;
			
		}
		/*Сохранение параметров пользователя */
		public void SaveUser()
		{
		//если были изменения данных
			if(this.changeUser) 
			{
				
			}
		}
		
		/*Удаление пользователя*/
		public void Ban()
		{
		this.banned = true;
		this.changeUser = true;
		}
		
		/*Подтверждение регистрации*/
		public void Aproove()
		{
			this.aproove = true;
			this.changeUser = true;
		}		
				
		/*Установка пола*/
		public void setSex(int s)
		{
		this.sex = s;
		this.changeUser = true;
		}
		
		/*Получение информации о поле пользователя*/
		public int getSex()
		{
		return this.sex;
		}
		
		/*Дата рождения*/
		public void setBirthdate(Date d)
		{
		this.birthDate = d;		
		this.changeUser = true;
		}
		
		public void setPassword(String p)
		{
			this.password=p;
		}

		public String genPassword(int size) /* size - Длина пароля */
		{
			String table = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
			Random rand = new Random();
			StringBuilder pass = new StringBuilder(size);
		   
			for ( int i = 0; i < size; i++ ) 
				pass.append( table.charAt( rand.nextInt(table.length()) ) );
		   
			return pass.toString();
		}
		
		
		
}
