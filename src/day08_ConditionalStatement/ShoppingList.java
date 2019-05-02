package day08_ConditionalStatement;

import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String item1, item2, item3, report;
	    double price1, price2, price3, totalPrice, totalPrice1, totalPrice2, totalPrice3;
	    int count1, count2, count3;
		
	    Scanner scan = new Scanner(System.in);
	    
		System.out.println("Enter Item1, count and its price:");
		item1 = scan.next();
	    count1 = scan.nextInt();
	    price1 = scan.nextDouble();
	    totalPrice1 = count1 * price1;
	    
	    if(count1 > 0) {
	    	System.out.println(totalPrice1);	
	    }
	    
	    System.out.println("Enter Item2, count and its price:");
		item2 = scan.next();
	    count2 = scan.nextInt();
	    price2 = scan.nextDouble();
        totalPrice2 = count2 * price2;
	    
	    if(count2 > 0) {
	    	System.out.println(totalPrice2);	
	    }
	    
	    System.out.println("Enter Item3, count and its price:");
		item3 = scan.next();
	    count3 = scan.nextInt();
	    price3 = scan.nextDouble();
        totalPrice3 = count3 * price3;
	    
	    if(count3 > 0) {
	    	System.out.println(totalPrice3);	
	    }
		
	    totalPrice = totalPrice1+totalPrice2+totalPrice3;
	    
	    report = "Item1: "+ item1 + ": "+ +totalPrice1+", "+ "Item3: "+item3+": " +totalPrice3;
	    
	    System.out.println(report);
	    
	    System.out.println("Total price: "+totalPrice);
	    

	}

}
