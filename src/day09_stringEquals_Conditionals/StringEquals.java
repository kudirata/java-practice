package day09_stringEquals_Conditionals;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "java";
		String str2 = "java";

	System.out.println(str1 == str2); //true
	
	System.out.println(str1 == "java"); //true
	System.out.println(str1 == "java"); //true
	
	
	// PREFERRED WAY
	
	System.out.println(str1.equals(str2)); //true
	
	System.out.println(str1.equals("java")); //true
	
	System.out.println(str2.equals("java")); //false
	
		
	}

}
