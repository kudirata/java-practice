package day37ARRAYLIST;
import java.util.*;
public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> cars = Arrays.asList("Tesla", "Porsche", "");
		
		// create ArrayList prices, assign 10 values using Arrays.asList method
		List<Double> prices = Arrays.asList(5.2, 10.0, 23.4, 200.5, 3.5, 720.1, 7.5, 2.8, 129.2, 5.5 );
		
		System.out.println(prices);
		
		//calculate the sum of all prices
		
		double sum = 0;
		
		for(double price : prices) {
			sum +=price;		
			
		}
		System.out.println("Sum: "+ sum);
		
		double sum2 = 0;
		
		for (int i = 0; i < prices.size(); i++) {
			
			sum2 += prices.get(i);
			
		}
		System.out.println("sum2: "+ sum2);
		
		// create new list called expensive, add prices that are more than 100
		
		List<Double> expensive = new ArrayList<>();
		
		for(double price : prices) {
			if(price > 100) {
				expensive.add(price);
				
			}
			
			
		}
		
		System.out.println("Expensive: "+ expensive.toString());
		
		//remove all expensive prices from prices
		prices.removeAll(expensive);
		
		System.out.println("Prices: "+ prices.toString());
		
	}
	

}
