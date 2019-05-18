package day38ARRAYLIST03;

import java.util.ArrayList;

public class RawArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		
	
	String allValues = list.toString();
	
	String str = list.get(0).toString();   // provides the first element of array
	
	Integer i = (Integer) list.get(2);//downcasting
	
    System.out.println(i);
		
		System.out.println(list.toString());
		System.out.println(list);
		System.out.println(allValues);
		System.out.println(str);
		System.out.println(i);
		
		// All values are stored as raw type, we can also call it as a general object type
		

	}

}
