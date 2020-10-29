package tw.leonchen.model;

public class LoginDAO {
	public boolean cheackLogin(String user, String pwd) {
		if (user.equals("John") && pwd.equals("test123")) {
			return true;
		}
		return false;

	}

}
