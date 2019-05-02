package day11_logical_nestedif;

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numOfPeople;
		double TotalBillAmount;
		double tip = 0.0;
		double totalToPay = 0.0;
		String people = "";
		
		// tip % input string
		// tip per person
		//total amount + tip
		//application to display 5 number of people
		
		Scanner scan = new Scanner (System.in);
		
		boolean split;
		
		String splitQuestion = "";
		System.out.println("Split:");
		splitQuestion = scan.next().toLowerCase();
		
		split = (splitQuestion.contentEquals("yes")) ? true : false;
			
		System.out.println("Number of people:");
		numOfPeople = scan.nextInt();
		
		switch (numOfPeople) {
		case 1:
			people ="&";
			break;
		case 2:
			people ="&&";
			break;
		case 3:
			people ="&&&";
			break;
		case 4:
			people ="&&&&";
			break;
		case 5:
			people ="&&&&&";
			break;
		case 6:
			people ="&&&&&&";
			break;
		case 7:
			people ="&&&&&&&";
			break;
		case 8:
			people ="&&&&&&&&";
			break;
		case 9:
			people ="&&&&&&&&&";
			break;
		case 10:
			people ="&&&&&&&&&&";
			break;
			default:
			
		}
		
		
		
		
		System.out.println("Check amount:");
		TotalBillAmount = scan .nextDouble();
		
		System.out.println("Service Quality:");
		String serviceQuality = scan.next();
		
		switch (serviceQuality) {
		case "Poor":
			tip = TotalBillAmount * .05;
			break;
		case "Fair":
			tip = TotalBillAmount * .1;
			break;
		case "Good":
			tip = TotalBillAmount * .15;
			break;
		case "Great":
			tip = TotalBillAmount * .2;
			break;
		case "Excellent":
			tip = TotalBillAmount * .25;
			break;
			default:
		
		}
		 totalToPay = tip + TotalBillAmount;
		
		if (split) { 
		
		System.out.println("Number of people entered: "+people);
		
		System.out.println("Total to pay: "+totalToPay);
		
		System.out.println("Total tip:"+ tip / numOfPeople);
		
		System.out.println("Total per person:" +(totalToPay / numOfPeople));
		
		System.out.println("Tip per person:"+ tip / numOfPeople);
		
		}else {
			System.out.println("Number of people entered: "+people);
			
			System.out.println("Total to pay: "+tip + TotalBillAmount);
			
			System.out.println("Total tip:"+totalToPay );
			
			
		}
		
		
		
		
		

	}

}
