package ReplitAssignments;

import java.util.Arrays;

public class AddToArray149 {

	public static void main(String[] args) {
		
		int [] arr = {2,3,5,65,45,34,2};
		int n = 123;
		
		int[] new_r = new int[arr.length+1];
		for (int i = 0; i < new_r.length; i++) {
			
			new_r[i] = arr[i];
			
			
		}
		new_r[new_r.length - 1] = n;
		System.out.println(Arrays.toString(new_r));
	}
	
	
		// TODO Auto-generated method stub

	}


