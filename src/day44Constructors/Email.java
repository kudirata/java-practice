package day44Constructors;

public class Email {
	String message;
	public Email(String message) {
		
		System.out.println("Sending Email with message: " + message);
		
		this.message = message;
	}
}
