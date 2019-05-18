package day15_String_Manipulation;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		System.out.println();
		
		String list = "potatoes, tomatoes, apples, milk, bread, cereal, meat, avocadoes, cucumbers";
		
		// check if apples is in the shopping list
		// if true, print "Apples are there!"
		// If false, print "Let's add apples now!"
		
		if (list.contains("apples")) {
			System.out.println("Apples are there!");
		}else {
			System.out.println("Let's add apples now!");
		}
		
	boolean hasEggs =	list.contains ("eggs");
	
	System.out.println("ContainsMethod eggs: "+hasEggs);
	
	boolean hasCucumbers = list.toLowerCase().contains ("cucumbers");
	
	System.out.println("ContainsMethod cucumbers: "+hasCucumbers);
	
	// you can use this type of program for example if you're searching for 'error' in a long list of log.
	
	System.out.println();
	
	 email = "name @yahoo.com";
	
	 if (email.contains("yahoo")) {
		 System.out.println("Yahoo account");
		 
		 System.out.println();
		 
		 String name = "Kudirat";
		 
		 if (name.contains("a") || name.contains("e")) {   // this line can take either 1 or 2 pipes.
			 System.out.println("'a' or 'e' is present!");
		 }else {
			 System.out.println("'a' or 'e' is missing!");
		 }
		 
		 
		 
	 }
	

	}

}
