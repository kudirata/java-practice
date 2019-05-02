package day08_ConditionalStatement;

public class ExplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10 / 2.0);  // result is going to be double
		
		System.out.println(10.0 / 2);
		
		int result = (int) (10 / 2.0);  // to convert to whole number int
		
		System.out.println(result);
		System.out.println();
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
				
		double average = (rent1+rent2+rent3+rent4) / 4;
		
		// double average = (rent1+rent2+rent3+rent4) / 4; gives result 1053.75
		
		System.out.println(average);
				
		
		double d = 40.2;
		int I = (byte) d;  //both explicit and implicit casting happening
		
		// explicit -- double > byte,
		//implicit --byte > int

		
		
	}

}
