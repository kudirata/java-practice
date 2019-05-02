package day31_VoidMethods03;

public class Authentication {

	/*
	 * Name: Login
	 * Return type: void
	 * String args / params : username, password
	 * Inside the method:
	 * validUsername = "mentoring @cybertekschool.com"
	 * validPassword = "mentor001"
	 * if username and password match, print "Login successful! Welcome to Okta"
	 * if not: "Sign in failed!"
	 * login("myLogin", "abc123");
	 */
	public static void login(String userName, String password) {
		
		login("mentoring@cybertekschool.com", "mentor001");    // call the method here
		
		String validUsername = "mentoring @cybertekschool.com";
		String validPassword = "mentor001";
		
		if(userName .equalsIgnoreCase(validUsername) && password.contentEquals(validPassword)) {
			System.out.println("Login successful, welcome to Okta!");
		}else {
			System.out.println("Sign in Failed!");
		}
		
	}
	
}
