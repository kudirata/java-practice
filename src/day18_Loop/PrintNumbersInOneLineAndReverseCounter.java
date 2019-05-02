package day18_Loop;

public class PrintNumbersInOneLineAndReverseCounter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// 1,2,3,4,5,6,7,8,9,10
		
		int num = 1;
		while(num <= 10) {
			System.out.print(num + ",");  // REMOVE ln FROM PRINT TO PRINT IN STRAIGHT LINE
			++num;
			Thread.sleep(1000); // pause the code execution for a second TO GIVE EFFECTS (1000 is in milliseconds)
		}
		System.out.println("\nNum value after loop:"+num); // prints 11 if sysout is put outside loop
		
		
		// 11,10,9,8,7,6,5,4,3,2,1
		
		int num2 = 11;
		
		while(num2 >= 1) {
			
		System.out.print(num2 + ",");
		
			--num2;   // DESCENDING ORDER
			
		}
		

	}

}
