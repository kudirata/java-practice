package day25_Arrays;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] products = {"Timberland shoes", "H&M Shirt", "Swatch","Gucci bag", "adidas socks"  };
		
		double [] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		
		int [] itemsId = {12345, 12346, 12347, 12348, 12349};
		
		// print the count of products
		
		System.out.println("Products count: "+ products.length);
		
		System.out.println();
		// check if product prices and items have same count
		
		if(products.length == prices.length && products.length == itemsId.length) {
			
			System.out.println("shopping list looks good");
		}else {
			System.out.println("Something is wrong in this list");
			return;
		}
		
		System.out.println();
		// loop though products and print each one in separate line
		for(String prod : products) {
			System.out.println(prod);
		}
		
		System.out.println();
		//prices --> for loop
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		System.out.println();
		// print itemsId in reverse order
		// print last itemId first
		
		System.out.println(itemsId[itemsId.length - 1]);
		for (int idx = itemsId.length - 1; idx >= 0; idx--) {
			System.out.println(itemsId[idx]);
			
		}
		
		// print a report with a total price
		// item 1: 12345 - Timberland shoes - $120.0
		// ...
		// Total price:
		
		System.out.println("########## YOUR SHOPPING RECEIPT #########");
		System.out.println();
		double totalPrice = 0.0;
		for (int i = 0; i < itemsId.length; i++) {   // use anyone here as they all have same length
			System.out.println("item 1 "+ (i + 1)+ ":" + itemsId[i] + "-" + products[i]);
			totalPrice += prices[i];
		}
		System.out.println("Total price: $" + totalPrice);
		
		// find the most expensive item in your list and print it as a report
		// Loop and find do not use arrays class
		
		
		int maxIndex = 0;
		double maxPrice = 0;
		
		for (int j = 0; j < prices.length; j++) {
			if(prices[j] > maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
			}
		}
		
		System.out.println(itemsId[maxIndex] + "-" + products[maxIndex]);
		
		// find the least expensive item
		
		int minIndex = 0;
		double minPrice =  0;
		
		for (int k = 1; k < prices.length; k++) {
			if(prices[k] < minPrice) {
				minPrice = prices[k];
				minIndex = k;
			}
		}
		
		System.out.println(itemsId[minIndex] + "-" + products[minIndex]);
		
		
		}
		
		
	}


