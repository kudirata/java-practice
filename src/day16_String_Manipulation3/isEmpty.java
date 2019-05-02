package day16_String_Manipulation3;

public class isEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// isEmpty() - when length is zero, checks if string is empty and returns true, otherwise it returns false
		
		String userName = "";
		System.out.println(userName.isEmpty());
		
		if (userName.isEmpty()) {
			System.out.println("Username field cannot be empty");
		}else {
			System.out.println("Username is not empty");
		}
		
		if (userName.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		}else {
			System.out.println("Username or password is not empty");
		}
		
		if (userName.length() == 0) {
			System.out.println("Username length is 0, so it is empty");
		}
		
		

	}

}
