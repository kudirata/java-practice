package day19_Loop;

public class DoWhileLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// print 1 to 10 using do while loop
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
			
		}while (i <= 10) ;
			
		// write a do while loop to calculate sum of numbers between 1 to 500
		// 1+2+3+4+5 = 15
		
		int sum = 0;
		int j = 1;
		
		do {
			
			sum += j;     // OR Sum = sum + j;
			j++;
		}while(j <= 500);   
		
		System.out.println("Sum from 1 to 5: "+sum);
	}

}
