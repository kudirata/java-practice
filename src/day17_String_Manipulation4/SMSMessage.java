package day17_String_Manipulation4;

import java.util.Scanner;

public class SMSMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    
	    
	    
	   // Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{IPad love programing and problem solving}
	    
	    String sender = message.substring(message.indexOf("<")+1 , message.indexOf(">"));
	    
	    System.out.println("Sender: "+sender);
	    
	    String phoneNumber = message.substring(message.indexOf("[")+1 , message.indexOf("]"));
	    
	    System.out.println("Phone Number: "+phoneNumber);
	    
	    String messageBody = message.substring(message.indexOf("{")+1 , message.indexOf("}"));
	    
	    System.out.println("Message Body: "+messageBody);
		
		

	}

}
