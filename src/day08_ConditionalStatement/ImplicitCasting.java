package day08_ConditionalStatement;

public class ImplicitCasting {

	public static void main(String[] args) {
		// Automatic casting from smaller to larger type
		
		short shortValue = 3455;
		int intValue = shortValue;  // you can also add (int) before shortValue but it's optional
		System.out.println("Int Book: "+intValue);
		
		double price = 345;  // result will add .0 i.e 345.0 because of implicit casting
		System.out.println("Price: "+ price);
		
		int price1 = 34563;
		double dPrice = price1;
		System.out.println("DPrcie: "+dPrice);
		
	}

}
