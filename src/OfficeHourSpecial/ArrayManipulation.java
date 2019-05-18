package OfficeHourSpecial;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,3,1,4,1,6};
		int target = 1; // need to remove all 1 from nums
		// find out how many target are in nums
		
		System.out.println(Arrays.toString(removeFromArray(nums, target)));
		
		int [] nums2 = removeFromArray(new int[] {3,3,5,5,6,1,3}, 3);
		
		System.out.println(Arrays.toString(nums2));
		
		int[] newArray = removeFromArray(nums, target);
				System.out.println(Arrays.toString(nums));
				System.out.println(Arrays.toString(newArray));
			
				int[] numremove =removeFromArray(nums,1);
				
		//System.out.println(Arrays.toString(nums));	
		//System.out.println(Arrays.toString(numremove));

	}

	private static int[] removeFromArray(int[] nums, int target) {
		int counter = 0;
		// loop using if condition, increase counter for each match
		
		for(int n : nums) {
			
			if (n == target) {
				counter++ ;
			}
			
			
		}
		
		System.out.println(counter);
		
		//declare new empty array with size that does not include target count
		
		int[] newArray = new int[nums.length - counter];
		//loop nums one more time and add all values that are not target
				int idx = 0;
				for(int n : nums) {
					if(n != target) { //(!(n == target))
						newArray[idx] = n;
						idx++;
					}
				}
		return newArray;
	}

	public static int[] removeFromArray1(int[] nums, int target) {
		// find out how many targets are in nums
		int counter = 0;
		// loop and using if condition, increase counter for each match
		for (int n : nums) {
			if (n == target) {
				counter++;
			}
		}
		// declare new empty array with size that
		// does not include target count
		int[] newArray = new int[nums.length - counter];
		// loop nums one more time and add all values that are not target
		int idx = 0;
		for (int n : nums) {
			if (n != target) { // (!(n == target))
				newArray[idx] = n;
				idx++; // add 1 so that it moves to next index
			}
		}
		return newArray;
	}
}
