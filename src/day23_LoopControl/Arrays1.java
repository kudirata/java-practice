package day23_LoopControl;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = new int [3];
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		
		// ASSIGN TO THE FIRST ELEMENT IN THE ARRAY VALUE OF NUM 1
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		
		numbers[0] = 7;
		numbers[1] = 8;
		
		//We cannot provide different data type, we have to use data type of array
		//numbers[2] = "A";
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("**********************************");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// MAXIMUM SIZE OF AN ARRAY
		//byte[] bytesArray = new byte[integer.MAX_VALUE];
		
		String [] name = new String [5];
		String [] names2 = {"Shaun", "Roman", "Vlad", "Burak", "Maria"};
		
		System.out.println(names2[4]);
		System.out.println("Number of items: "+ names2.length);
		String[] countries = {};
		countries[0] = "USA";
		
		
	}

}
