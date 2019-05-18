package day45Constructors02;

import java.util.Random;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;
	
	//constructor 1 No-args.sets all as empty string
	
	public EtsyAccount() {
		
		
		this.email = "";
		this.firstName = "";
		this.password = "";
	}	
	
	//constructor 2
	// takes 3 args and sets them to instance variables using setters
	
	public EtsyAccount(String email, String firstName, String password) {
		System.out.println("Three-args constuctor");
		
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
	}
	//constructor 3
	//email, firstname ==> call setter methods
	// password is auto generated and assigned
	
	public EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password = getRandomPassword();// random password with 6 characters
		
		
	}
	
	private String getRandomPassword() {
		Random rd = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
		String rdPassword = "";
		
		for (int i = 1; i <= 6; i++) {
			rdPassword += letters.charAt(rd.nextInt(letters.length()));
		}
		return rdPassword;
	}
	
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		//if it contains @ somewhere in the middle, assign it
		//if not print: " Please enter a valid email address. "
		
		if(email.indexOf("@") > 0 && email.indexOf("@") != email.length() -1) {
			
			
		}else {
			System.out.println(" Please enter a valid email address. ");
		}
		
		
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		// can't be blank
		// needs to be only alphabetic or letters
		
		if(isValidFirstName(firstName)) {
			this.firstName = firstName;
		}else {
			System.out.println("Your first name contains invalid characters.");
		}
	
		
		this.firstName = firstName;
	}
	// valid is all letters, can have space in middle
	//invalid: cannot contain numbers or any other chars
	
	private boolean isValidFirstName(String firstName) {
		// check first if ir starts with or ends with space
		//return false if true
		
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		
		if(firstName.isEmpty()) {
			System.out.println("Cannot be blank");
			return false;
		}
		
		
		
		for (int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if(!Character.isAlphabetic(ch) && ch != ' ') {
				return false;
			}
			
		}
		return true;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length() < 6) {
			System.out.println("Must be at least 6 characters. ");
			
		}else {
			this.password = password;
		}
		
		
	}

	
}
