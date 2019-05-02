package day23_LoopControl;

public class PrintNumbersWithLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * PRINT a triangle by using nested loops like in the example below:
			1
			12
			123
			1234
			12345
			123456
			1234567
			123458910
		 
		 * AND PRINT REVERSE
		 */
		
		
		
		for ( int j = 10; j >= 1; j--) {
			  for (int i = j; i >= 1; i --) {	  
				  System.out.print(i + " ");
		}
			System.out.println();
		}
			System.out.println("===================");

		for ( int j = 1; j <= 10; j++) {
			  for (int i = j; i <= 10; i ++) {	  
				  System.out.print(i + " ");
		}
			System.out.println();
		}

	}

}
