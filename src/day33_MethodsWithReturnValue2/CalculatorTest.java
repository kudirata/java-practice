package day33_MethodsWithReturnValue2;

public class CalculatorTest {

	public static void main(String[] args) {
		
		System.out.println(CalculatorFinal.add(3, 1));
		System.out.println(CalculatorFinal.multiply(5, 6));
		System.out.println(CalculatorFinal.minus(40, 12));
		System.out.println(CalculatorFinal.divide(100, 2));
		
		int addResult = CalculatorFinal.add(21, 41);
		double mResult = CalculatorFinal.multiply(50, 40);
		double miResult = CalculatorFinal.minus(3000, 200);
		double dResult = CalculatorFinal.divide(455, 5);
		
		System.out.println("addResult: "+ addResult);
		System.out.println("mResult: "+ mResult);
		System.out.println("miResult: "+ miResult);
		System.out.println("dResult: "+ dResult);
		
		double a = 10.0, b = 5.0;
		double myResult = CalculatorFinal.minus(a,  b);
		System.out.println("myResult: "+ myResult);
		
		double [] dNums = {2.0, 4.0};
		double result2 = CalculatorFinal.multiply(dNums[0],  dNums[1]);
		System.out.println("result2: "+ result2);
		
		if(CalculatorFinal.add(10, 16) == 26) {
			
			System.out.println("Add Unit Test Passed");
			
		}else {
			System.out.println("Add Unit Test Failed");
		}
		
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It is 4 characters");
			
		}else {
			System.out.println("It is not 4 characters");
		}
		
	}
}
