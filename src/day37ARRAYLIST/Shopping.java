package day37ARRAYLIST;

import java.util.ArrayList;

public class Shopping {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("Shoes");
		shoppingList.add("Bag");
		shoppingList.add("Watch");
		shoppingList.add("Necklace");
		shoppingList.add("Bracelet");
		shoppingList.add("Earrings");
		
		//print number of items
		int count = shoppingList.size();
		
		System.out.println("Total count: "+ count);
		
		// print all items in single line
		System.out.println(shoppingList.toString());
		
		//print first and last item in single line
		System.out.println(shoppingList.get(0)+ "|" + shoppingList.get(count - 1));
		
		shoppingList.remove("Shoes");
		shoppingList.remove("Necklace");
		
		System.out.println(shoppingList);
		
		System.out.println(shoppingList.get(0));
		
		shoppingList.remove(0);
		
		System.out.println(shoppingList.toString());
		
		
		for(String item : shoppingList) {  // For each loop can be used only for reading, we cannot modify list inside for each loop
			System.out.println(item);
			
		}
		//remove all items at once
		
		shoppingList.clear();
		
		System.out.println(shoppingList);
		
	}
	
	
}
