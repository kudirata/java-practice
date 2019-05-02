package day14_Strings_Manipulation;

public class StringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Good Morning";
		
		// cneck if it matches "Good morning" and print match
		// or not match
		
		
		
		
		if (str1.contentEquals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		
		if (str1.equalsIgnoreCase("Good Morning")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not match - ignore case");
		}
		
		// convert to all uppercase and print
		System.out.println(str1.toUpperCase());
		System.out.println(str1); // it stays as old value, not uppercase
		str1 = str1.toUpperCase();
		
		System.out.println("After Assignment: "+str1);
		
		
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("chained methods: do not match");
		}
		
		// FIND OUT HOW MANY CHARACTERS IN THE STRING
		
		String myName = "Kudirat";
		
		System.out.println(myName.length());
		
		int length = myName.length();
		
		System.out.println("My name's length:"+length);
		
		System.out.println();
		// username must be exactly 8 characters
		
		String userName = "Kudirat1";
		
		if(userName.length()== 8) {
			System.out.println("Valid userName");
		}else {
			
				System.out.println("invalid userName, must be 8 characters");
			}
		
		System.out.println();
		// password must be at least 6 characters
		
		String password = "woodenSpoon";
		if (password.length() < 6) {
			System.out.println("Password is good");
		}else {
			System.out.println("Password is too short");
		}
		
		System.out.println();

		int passwordLength = password.length();
		if(passwordLength < 6 ) {
			System.out.println("Invalid password");
			
		}else {
			System.out.println("valid password, password is good");
		}
		
		
		
	}

}
