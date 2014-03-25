package vmdeep.chatlists.auth;

import java.util.Date;

public class User {
	
		public final String fullName;
		public final String email;
		public final String nickName;
		public int sex;		
		public Date birthDate; 
		public boolean showDate; //Показывать ль дату рождения в профиле
		public boolean aproove;  //учетная запись подтверждена (email/телефон)
		public String password;
		public boolean banned;
		public boolean changeUser; //флаг изменения параметров
		
		public User(String n, String f,  String e) {
			fullName = f;
			email = e;
			nickName = n;
			
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

		public String genPassword()
		{
			String p="пароль";
			//TODO генерация пароля
			return p;
		}
		
		
		
}
