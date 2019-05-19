package day47Blocks;

public class VariableAccess {

	//instance variable
	int myInstanceVar = 40;
	
	//static variable
	static int myStaticVariable = 55;
	
	public static void main(String[] args) {
		//cannot access non-static from static method
		//System.out.println(myInstanceVar);   will not compile
		
		System.out.println(myStaticVariable);
		
		// create object of VariableAccess and print myInstanceVar
		
	}
	
}
