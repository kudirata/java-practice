package day47Blocks;
import java.time.LocalDateTime;

public class BriteErp {

	static {
		System.out.println("Launch Browser");
		System.out.println("Navigate to: "+ TestData.url);
		
	}
	public static void enterEmail() {
		System.out.println("Enter email: " + TestData.email);
	}
	public static void enterPassword() {
		System.out.println("Enter password: "+ TestData.password);
	}
	public static void verifyLogin() {
		System.out.println("Expected Name: "+ TestData.userName);
		System.out.println("Actual Name Displayed: Munize Ajose");
		System.out.println("Login Successful - " + LocalDateTime.now());
	}
}
