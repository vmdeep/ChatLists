package vmdeep.chatlists.auth;

public class User {
		public final String fullName;
		public final String email;
		public final String nickName;
		
		public User(String n, String f,  String e) {
			fullName = f;
			email = e;
			nickName = n;
		}
}
