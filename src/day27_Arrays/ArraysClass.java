package day27_Arrays;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {43, 12, 4, 1, 3,5};
		
		//toString method
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println();
		String str = Arrays.toString(nums);
		
		System.out.println(str);
		
		System.out.println();
		
		// sort method: - sorts arrays in ascending order 
		
		Arrays.sort(nums);
		

		System.out.println(Arrays.toString(nums));
		
		System.out.println();
		String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic","Uzbek"};
		System.out.println(Arrays.toString(languages));
		
		System.out.println();
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		System.out.println();
		int[] nums2 = {345, 665,3333, 11, 3, 66};
		
		//find the lowest and largest values from nums2 array
		
		System.out.println(Arrays.toString(nums2));
		
		Arrays.parallelSort(nums2);
		
		int lowest = nums2[0];
		int largest = nums2[nums2.length -1];
		
		System.out.println("Lowest num: "+lowest);
		
		System.out.println("Largest num: "+largest);
		
		
	}

}
