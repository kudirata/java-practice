package day24_Arrays;

public class PossibleCombinationOfTwoLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a loop that displays all possible combinations of two letters where the
		 * letters are 'a', or 'b', or 'c', or 'd', or 'e'. The combinations should be
		 * displayed in ascending alphabetical order: aa ab ac ad ae ba bb ... ee
		 *
		 */

		
		for(char i = 'a'; i<='e'; i++) {
			for(char j = 'a'; j<='e'; j++) {
				
				System.out.println(i+ "" + j);
			}

		}
		
		
		
		
	}

}


