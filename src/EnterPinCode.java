import java.util.Scanner;

public class EnterPinCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int secretPinCode = 1234;
		
		int pinCode = 0;
		
		
		
		// keep asking for pincode until correct one is entered
		
		while(pinCode != secretPinCode ) {
			System.out.println("Enter Pin Code");
			pinCode = scan.nextInt();
			
		}
		System.out.println("Access granted, select operation");
		
		// Access granted, select operation
		
		

	}

}
