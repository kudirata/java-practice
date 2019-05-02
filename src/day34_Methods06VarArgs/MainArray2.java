package day34_Methods06VarArgs;

import java.util.Arrays;

public class MainArray2 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray));
	}
	
		// TODO Auto-generated method stub
		/*
		 * 	Method name: getArray
			Return type: int[]
			No params:
			In the method , build array and assign value then return it
		 
		 */
			
		
		public static int[] getArray() {
			int[] retArray = {45, 43, 11, 545, 1000};
			return retArray;
		}

	}


