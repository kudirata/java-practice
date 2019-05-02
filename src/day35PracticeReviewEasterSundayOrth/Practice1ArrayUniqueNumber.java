package day35PracticeReviewEasterSundayOrth;

import java.util.Arrays;

public class Practice1ArrayUniqueNumber {
	
	public static void main(String[] args) {
		
	
	/*
	 * int[] array and we need to print unique numbers
1) in main method
2) void method that accepts an array
3) method that accepts int[] and returns int[] with unique values
package day35_methods07_practice
Class UniqueArray
    declare array nums and assign values
    {7,4,1,4,1,5,9,9,3}
    code to find unique values:
        nested loop
        if condition
        counter
	 * 
	 */

	int[] arr = {7,4,1,4,1,5,9,9,3};
	System.out.println(Arrays.toString(arr));
	
	findUnique(arr);
	
	
	
	}

	private static void findUnique(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			
			int temp = arr[i];        // this line prints array numbers 1 by 1 , a new array, temp to compare with, now we have 2 arrays of same type. Need 2 for loops to compare the 2 arrays
			//System.out.println(arr[i]);
			
			int counter = 0;          // counter checks the 1st number in 1st array and looks in 2nd array to see if it appears more than once
			
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] == temp && i != j) {
					counter++;
					break;
					
				}
				
			}
			
			if(counter == 0) {
				
				System.out.println(temp);
				
			}
			
		}
	}

}