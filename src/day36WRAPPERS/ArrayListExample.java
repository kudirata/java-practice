package day36WRAPPERS;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// Declare ArrayList called languages
		
		
		ArrayList<String> languages = new ArrayList<>();
		
		// add values
		
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("French");
		languages.add("Yoruba");
		//languages.add(true));   will not work because it's not a string
		
		System.out.println("Number of values: "+ languages.size());
		languages.add("Turkish");
		System.out.println("Number of values: "+ languages.size());
		
		// remove Java
		
		languages.remove(0);
		
		System.out.println("Number of values: "+ languages.size());
		
		System.out.println( languages.toString());

	}

}
