package day46Static;

public class CalcTests {

	public static void main(String[] args) {
		
		double result = Calculator.plus(55, 7);
		System.out.println("Result: "+ result);
		
		result = Calculator.minus(44, 14);
		System.out.println("Result: "+ result);
		
		
		result = Calculator.multiply(50, 10);
		System.out.println("Result: "+ result);
		
		Calculator c = new Calculator();
		System.out.println(c.multiply(4, 2));
		
	int i =	Integer.parseInt("33");
	System.out.println( Character.isDigit('5'));
	
	// System.out.println();	System is class name; out is a variable name; 
	//println is a non-static method
	
	}

}
