package day27_Arrays;

import java.util.Arrays;



public class ArraysEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {4,5,6,10,100};
		
		int[] nums2 = {4,5,6,10,100};
		
		System.out.println(Arrays.equals(nums1,  nums2));  // result is true because they are the same.
		
		if(Arrays.equals(nums1,  nums2)) {
			System.out.println("Thay are exactly the same");
			
		}else {
			System.out.println("Mismatched values present");
		}
		
		String[] strArr1 = {"one", "two", "three"};
		
		String[] strArr2 = {"One", "Two", "three"};   // note that these elements have uppercase so result will be false
		
		System.out.println(Arrays.equals(strArr1, strArr2));
		System.out.println();
		
		boolean match = Arrays.deepEquals(strArr1,  strArr2);
		System.out.println("match: " + match);
		
		//Arrays.equals(strArr1,  nums2) - this will not work because we cannot compare string to integer, has to be string to string or integer to integer
		
	}

}
