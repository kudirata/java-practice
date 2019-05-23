package day08_ConditionalStatement;

public class CastingPrimitives {

	public static void main(String[] args) {
		// cast double value to int
		
		
		int i = (int) 3.4;  // will remove .4
		
		System.out.println("i : "+i);
		System.out.println();
		
		double price = 230.50;
		int dollars = (int) price;
		
		
		System.out.println("Price: "+ price);
		System.out.println("Dollars: "+ dollars);
		
System.out.println();
		int count = 44;
		byte byteCount = (byte)count;
		System.out.println("ByteCount: "+byteCount);
		
		System.out.println();
		int count1 = 244;
		byte byteCount1 = (byte)count1;
		
		System.out.println("ByteCount1: "+byteCount1);
		
		long longValue = 345378L;
		int intValue = (int)longValue;
		System.out.println("Int Book: " + intValue);
		
		System.out.println();
		int large = 5678;
		short small = (short) large;
		System.out.println("Small: "+small);
		
		int result = (int) (500.4/2.0);  // result will be 250 not 250.2
		
		System.out.println("Result: "+result);
		
		
		
		
		
		
	}

}
