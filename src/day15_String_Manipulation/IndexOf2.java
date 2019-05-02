package day15_String_Manipulation;

public class IndexOf2 {

	public static void main(String[] args) {
		// INDEX OF WITH 2 INPUTS
		
		String list = "html-selenium-angular-jenkins-grid ";
		int firstDash = list.indexOf("-");
		System.out.println("First dash: "+firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("Second dash: "+secondDash);
		
		// FIND THIRD DASH BY USING secondDash VARIABLE  
		
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println("Third dash: "+thirdDash);
		
		// Find the last dash
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: "+lastDash);

		System.out.println();
		
		String word = "Java";
		
		int first = word.indexOf("a");
		int second = word.indexOf("a", first+1);
		
	}

}
