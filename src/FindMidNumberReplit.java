import java.util.Scanner;

public class FindMidNumberReplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1, num2, num3;
		int median = 0;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter first number:");
	    num1 = scan.nextInt();
	    
	    System.out.println("Enter second number:");
	    num2 = scan.nextInt();
	    
	    System.out.println("Enter third number:");
	    num3 = scan.nextInt();
	    
	    if( median == (num1 + num2 + num3) / 3) {
	      System.out.println("Medium value is: "+median);
	    }
	    
		
		

	}

}
