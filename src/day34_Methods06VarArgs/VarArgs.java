package day34_Methods06VarArgs;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		printWords("red", "blue");   // 2 values
		printWords("grey");   // one value
		printWords();
	// empty so array will be empty	
		
		String[] myPets = {"Cat", "Horse", "Dog", "Sheep", "Goat"};
		printWords(myPets);
		
		System.out.println(sum(3,5,10));
		
		System.out.println(sum(873,545,879844, 55, 545454, 33232));
		
		int budget = 200;
		
		if(sum(10, 45, 110, 30) <= budget) {
			System.out.println("Within budget");
			
		}else {
			System.out.println("Broke");
		}
		int total = sum(234, 43, 567, 12, 34,5);
		System.out.println("total: "+ total);
		
		cook("Burrito Bowl", "Rice", "Beans", "Meat", "Sour Cream", "Cheese");
		cook("Avocado Toast", "Avocado", "Sunny Side eggs", "Wheat Bread" );
		shoppingList(1000, "Avocado toast", "Swatch", "Shoes");
		
	}
	public static void printWords(String... words) {
		
		// "..." can only be used in method parameter and nowhere else. Handle it like an array. "..." is called VarArgs. It can accept 0 or more values
		// each input needs to be separated by comma
		// when we use VarArgs with other parameters, it needs to be the last one e.g. public static void cook(String name, String... ings){}
		// only one VarArg is allowed in a method parameter.
		//"..." can also not be the last like this (String args ...)
		// how to call VarArg, you can call in empty, one or multiple array i.e. sumAll(0), sumAll(10), sumAll(10,20)
		
		for(String w : words) {
			System.out.println(w);
			
		}
		
	}
	
	//provide sum of all the numbers passed when we call code e.g. sum(13,30,40); ==> 80
	public static int sum(int... nums) {
		
			int sum = 0;
			
			for(int n : nums) {
				sum += n;  // sum = sum + n
		}
		return sum;
	}
	
	public static void cook(String name, String... ings) {
		System.out.println("Food: "+ name);
		System.out.println(Arrays.deepToString(ings));
		
	}

	//shoppingList(1000, "Avocado toast", "Swatch", "Shoes");
	public static void shoppingList(int totalPrice, String... items) {
		System.out.print("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
		
	}


}

