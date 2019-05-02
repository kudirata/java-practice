package day11_logical_nestedif;

import java.util.Scanner;

public class LogInTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		
		
		// CONDITIONS: 1) username = validUsername
		// password = password
		// print "Login Successful, Welcome!"
		// 2) username != validUsername
		// password != password
		// print " Invalid username and Invalid Password"
		// 3) username == validUsername
		// password != password
		// print "Invalid Password'
		// 4) username != validUsername
		// password == password
		// print "Invalid username"
		// for strings do not use != this is used for numbers, for strings use ! and .equals
		
		// String str1 = "abc";
		// String str2 = "ABC";
		//str1.contentEquals(str2) = false because equals checks for uppercase, lowercase differences too
		// str1.equals 
		
		// USING OPERATORS WITH STRINGS
		
		
		System.out.println("Enter username:");
        String username = scan.next();
        
        System.out.println("Enter password:");
        String password = scan.next();
        
        String validUsername = "cybertek@mail.com";
        String validPassword = "WoodenSpoon123";
        
        // username = "cybertek12@mail.com"
        // password = "aber324"
        
        if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
            System.out.println("Login Successful, Welcome!");
        } else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
            System.out.println("Invalid Username and Invalid Password");
        } else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
            System.out.println("Invalid Password");
        } else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
            System.out.println("Invalid Username");
        }

}
	
}
	
	
	
	