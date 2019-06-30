package Day62_Exceptions01;

public class TryCatchFinally {
	public static void main(String[] args) {
		String str = "selenium";
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
		}catch(Exception e) {
			System.out.println("Enter correct index");
			//System.exit(0);
			//return;//get out from main method
		}finally {
			System.out.println("Finally block");
		}
		
		System.out.println("AFTER TRY CATCH FINALLY");
		
	}
}
