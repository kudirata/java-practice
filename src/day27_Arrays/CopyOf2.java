package day27_Arrays;

import java.util.Arrays;

public class CopyOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// copy all the values from array and add 2 more spaces
		
		int[] nums1 = {36, 56, 23,1, 55};
		
		int[] nums2 = Arrays.copyOf(nums1,  nums1.length + 2);
		
		int[] nums3 = Arrays.copyOfRange(nums1,  1, 4);
		
		System.out.println("Nums3: " + Arrays.toString(nums3));
		
		System.out.println(Arrays.toString(nums2));
		
		nums2[5] = 100;
		nums2[6] = 200;
		
		System.out.println(Arrays.toString(nums2));
		
		int[] brandNew = {34, 23, 54, 23};
		
		System.out.println();
		
		System.out.println("Length before:"+ brandNew.length);
		

	}

}
