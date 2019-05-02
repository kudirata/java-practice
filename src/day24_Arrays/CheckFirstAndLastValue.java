package day24_Arrays;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {
		
		// WRITE A PROGRAM THAT WILL PRINT TRUE IF FIRST & LAST NUMBERS ARE THE SAME
		// IF FIRST & LAST VALUE IN THE ARRAY OF INTS ARE SAME - PRINT TRUE
		
		int [] numbers = {12,41,213,21,42,12};
		
		boolean equals = numbers[0] == numbers[numbers.length-1];   // IN ARRAYS YOU CAN USE ".length" WITHOUT "()" .length is not a method here it is instance variable (property)
		
		System.out.println(equals);
		
		System.out.println(numbers[0] == numbers[numbers.length - 1]);
		
		if (numbers[0] == numbers[numbers.length - 1]) {
			System.out.println();
		}
		

	}

}
