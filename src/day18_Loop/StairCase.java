package day18_Loop;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 **
		 ***
		 **** 
		 *****
		 ******
		 ******* 
		 ******** 
		 */
		
		String stairs = "*";
		
		//1) with a counter
		
	int num = 1;
		while(num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		}
		
		System.out.println();
		
		
		//2) by checking length()
		
		stairs = "*";
		while(stairs .length() <= 10) {
			System.out.println(stairs);
			stairs  += "*";
		}
		
		

	}

}
