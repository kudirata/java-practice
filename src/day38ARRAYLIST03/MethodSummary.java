package day38ARRAYLIST03;

import java.util.*;

public class MethodSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("grey");
		list.add("black");
		
		//add method with index: "yellow will be placed to index '0'
		
		list.add(0, "yellow");
		
		//toString method to print all values in same line
		
		System.out.println(list.toString());
		
		// size method. return number of values
		
		System.out.println("Number of elements: "+ list.size());
		
		// get method.return value from index
		
		System.out.println("3: "+ list.get(3));
		
		System.out.println("0: "+ list.get(0));
		
		// remove using index. removes value from index position
		list.remove(0);  //removes yellow from index 0
		
		System.out.println(list.toString());
		
		//remove using value element. removes first occurring element
		list.remove("blue");  // removes blue
		
		System.out.println(list.toString());
		
		// set(index, value) replaces certain index with new value
		
		list.set(0,  "orange");  //red will be replaced by orange
		
		System.out.println(list.toString());
		
		//indexOf(value). returns index of value in the list
		
		System.out.println("grey: "+ list.indexOf("grey"));
		
		System.out.println("green: "+ list.indexOf("green"));
		
		//isEmpty returns true if list is empty. size == 0
		
		System.out.println("is list empty? - " + list.isEmpty());
		
		System.out.println("is list empty? - " + (list.size() == 0));

		
		System.out.println("white in list? - "+ list.contains("white"));
		
		List<String> list2 = new ArrayList<>();
		
		list2.addAll(list);
		System.out.println("list2: "+ list2.toString());
		
		System.out.println("containsAll: "+ list.containsAll(list2));
		
		System.out.println("equals: " + list.equals(list2));
		
		list2.add("pink");
		
		System.out.println();
		
		// removeAll list
		
		list2.removeAll(list);
		
		System.out.println("list2 after removeAll: " + list2);
		
		System.out.println("list: " + list);
		
		//AddAll
		
		list2.addAll(0, list);
		
		System.out.println("list2 after list2.addAll(0, list):" + list2);
		
		//clear
		list.clear();
		list2.clear();
		
		System.out.println("both empty? - "+ (list.isEmpty() && list2.isEmpty()));

	}

}
