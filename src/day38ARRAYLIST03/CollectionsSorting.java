package day38ARRAYLIST03;

import java.util.*;

public class CollectionsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> numsList = new ArrayList<>();
		
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		
		System.out.println(numsList);
		
		System.out.println("Sorting....please wait...");
		
		Collections.sort(numsList);
		
		System.out.println(numsList);
		
		List<String> strList = new ArrayList<> ();
		
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Muhabbat");
		strList.add("Maria");
		strList.add("Dina");
		strList.add("Bojan");
		
		System.out.println(strList);
		
		System.out.println("Sorting....please wait...");
		
		Collections.sort(strList);
		
		System.out.println(strList);
		
		// Max and Min
		
		int maxNum = Collections.max(numsList);
		int minNum = Collections.max(numsList);
		
		System.out.println("maxNum: "+ maxNum);
		
		System.out.println("minNum: "+ minNum);
		
		System.out.println();
		//MIn, Max StrList
		String maxName = Collections.max(strList);
		String minName = Collections.min(strList);
		
		System.out.println("maxName: "+ maxName);
		
		System.out.println("minName: "+ minName);
		

	}

}
