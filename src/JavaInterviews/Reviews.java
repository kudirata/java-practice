package JavaInterviews;

public class Reviews {

private static void divide(int num1, int num2) {
		
		if (num2==0) {System.out.println("Invalid operation. Can not divide by 0.");} 
		boolean pos = true;
		
		if (num1 < 0 ^ num2 < 0) {pos = false;}
		
		num1 = Math.abs(num1);
		num2 = Math.abs(num2);
		
		int count = 0;
		int remainder = 0;
		
		while (num1 >= num2) {
			num1 -= num2;
			count++;
			remainder = num1;
		}
		
		if(!pos) count *= -1;
		System.out.println("division: " + count);
		System.out.println("remainder: " + remainder);
	}
}
