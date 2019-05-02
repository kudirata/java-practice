package OfficeHourSpecial;

import java.util.*;

public class AddingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
				int[] nums1 = {10, 20, 5, 3, 6};
				int[] nums2 = {5, 1, 1, 4, 10};
				
				System.out.println(nums1[0] + nums2[0]);
				//declare new empty array with size of nums1
				int[] nums3 = new int[nums1.length];
				
				for(int i = 0; i < nums1.length; i++) {
					nums3[i] = nums1[i] + nums2[i];
				}
				
				System.out.println("nums1:"+ Arrays.toString(nums1));
				System.out.println("nums2:"+ Arrays.toString(nums2));
				System.out.println("nums3:"+ Arrays.toString(nums3));
			}
		}
		





	


