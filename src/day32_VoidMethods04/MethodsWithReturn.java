package day32_VoidMethods04;

public class MethodsWithReturn {

	public static void main(String[] args) {
	System.out.println(giveMe10$());
	
	int i = giveMe10$();
	System.out.println("i: "+ i);
	
	}
	
	
	/*
	 * This method returns int value
	 * 
	 * 
	 */
	
	
	
	public static int giveMe10$() {
		System.out.println("returning 10 from method");
		return 10;
		
		
		
	}
	
	/*
	 * giveMeYourName()
	 * return type String
	 */
	
	public static String giveMeYourName() {
		String name = "Murodil";
		return name; // return "Murodil"
				
	}
	
	
	
}
