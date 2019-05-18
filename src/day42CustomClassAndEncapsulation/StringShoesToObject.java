package day42CustomClassAndEncapsulation;

import java.util.*;

import java.lang.*; // always imports by itself

public class StringShoesToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "Bruno Magli, 9.5";
		
		String[] arrData = data.split(",");
		
		// create shoes object
		
		Shoes shoes = new Shoes();
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		System.out.println(shoes.getShoesData());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("What is your shoe size?");
		double size = scan.nextDouble();
		
		// create object using data from scanner
		
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand,  size);
		System.out.println(myShoes.getShoesData());

	}

}
