package day27_Arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {4, 6,7,10,55};
		
		System.out.println(Arrays.binarySearch(nums,  7));
		
		System.out.println(Arrays.binarySearch(nums,  55));
		
		System.out.println(Arrays.binarySearch(nums,  1)); // if number does not exist in array, it give result (-1)
		
		System.out.println(Arrays.binarySearch(nums,  5)); // -2
		
		int i = Arrays.binarySearch(nums,  10);
		System.out.println(i);
		
		int[] nums2 = {40, 6, 17,10, 55};
		System.out.println(Arrays.binarySearch(nums2, 40)); // -5 gives irregular answer if array is not sorted.
		
		Arrays.parallelSort(nums2);
		
		System.out.println(Arrays.binarySearch(nums2, 40));  // 3

	}

}
