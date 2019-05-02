package day24_Arrays;

import java.util.Arrays;

public class LotteryTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		
		System.out.println(Arrays.toString(lotteryNumbers));
		
		System.out.println();
		
		Arrays.parallelSort(lotteryNumbers);
		
		System.out.println(Arrays.toString(lotteryNumbers));
		System.out.println();
		
		// BINARY SEARCH WORKS ONLY WITH SORTED ARRAY
		// If value doesn't exist (it will return negative number)
		
		int index = Arrays.binarySearch(lotteryNumbers, 45);
		System.out.println("Position "+ index);
		
		int index2 = Arrays.binarySearch(lotteryNumbers, 5);
		System.out.println("Position "+ index2);
		

	}

}
