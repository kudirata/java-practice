package day18_Loop;

public class Print1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		while (num <= 100) {
			System.out.println(num);
			++num;        // this line ensures it stops and not become infinite.
		}
		System.out.println(num);  // adding this line make it to print 101
		
		// infinite loop example	
		//int counter = 0;
		//while(true) {
			//System.out.println(counter);
			//counter++;
		// }
		
		
	}

}
