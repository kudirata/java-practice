package day16_String_Manipulation3;

public class CapitalCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Abuja is the capital of Nigeria";
		
		// Moscow, Russia
		// Baku Azerbaijan
		
		
		//str = str.replace("Abuja", "Moscow");
		//str = str.replace("Nigeria", "Russia");
		
		//System.out.println(str);
		
		str = str.replace("Abuja", "Baku").replace("Nigeria", "Azerbaijan");
		
		System.out.println(str);
		System.out.println();
		
		String email = "firstName_LastName@gmail.com";
        
        String company = "capitalone";
        
        String newEmail = email.replace("gmail", company);
        
        System.out.println(newEmail);
		
		

	}

}
