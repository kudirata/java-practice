package day37ARRAYLIST;

import java.util.*;

public class MyCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Lagos");
		cities.add("Reston");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Ashburn");
		cities.add("Baku");
		
		//print each city using for each loop separated by space
		
		for(String city : cities) {
			System.out.print(city + " ");
		}
		
		System.out.println();
		
		// print each city using for loop, separated by spaces
		
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i)+ " ");
		}
		System.out.println();
		System.out.println();
		//remove Baku
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");   // it will not remove or show error
		System.out.println(cities.toString());
		
		System.out.println();
		//is empty?
		
		System.out.println("Is list empty? " + cities.isEmpty());
		
		cities.add(0, "Herndon");
		System.out.print(cities.toString());
		
		System.out.println();
		cities.add(1, "Istanbul");
		
		System.out.print(cities.toString());
		System.out.println();
		cities.set(2, "Seoul");   //set replaces in ArrayList
		
		System.out.println(cities.toString());
		
		//find sterling in the list and give the index
		
		int idx = cities.indexOf("Sterling");
		
		System.out.println("Sterling Index: " + idx);
		
		cities.set(idx,  "Zagreb");
		System.out.print(cities.toString());
		
		System.out.println();
		cities.clear();
		
		boolean empty = cities.isEmpty();
		System.out.println("Empty: "+ empty);
		
	}

}
