package day38ARRAYLIST03;

import java.util.*;
public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> friends1 = new ArrayList <>();
		List<String> friends2 = new ArrayList <>();
		
		friends1.add("Roman");
		friends1.add("Natalia");
		friends1.add("Orhan");
		friends1.add("Elizabeth");
		
		
		friends2.add("Roman");
		friends2.add("Natalia");
		friends2.add("Elizabeth");
		friends2.add("Orhan");
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		System.out.println();
		if(friends1.equals(friends1)) {
			System.out.println("same friends");
		}else {
			System.out.println("Different friends");
		}

	}

}
