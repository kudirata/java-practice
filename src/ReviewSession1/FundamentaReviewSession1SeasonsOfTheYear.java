package ReviewSession1;

import java.util.Scanner;

public class FundamentaReviewSession1SeasonsOfTheYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// please write a program that will print season name
				// based on the int value
				// value will provided through the scanner
				// 1
				// Winter
				// 6
				// Summer
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter month number");
				int month = scan.nextInt();
				if (month >= 1 && month <= 2 || month == 12) {
					System.out.println("Winter");
				} else if (month >= 3 && month <= 5) {
					System.out.println("Spring");
				} else if (month >= 6 && month <= 8) {
					System.out.println("Summer");
				} else if (month >= 9 && month <= 11) {
					System.out.println("Fall");
				} else {
					System.out.println("Invalid value!");
				}

				
				
	}

}
