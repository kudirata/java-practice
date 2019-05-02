package day12_logical_Switch_Ternary;

public class Switch_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// with switch statement we can only test if variable equals certain values
		
		int score = 2;

		switch (score) {
		case 1:
		System.out.println("Score is 1");
		break;  // exit switch statement
		case 2:
		System.out.println("Score is 2");
		break;
		case 3:
			System.out.println("Score is 3");
			break;
			default:  // IS USED IN PLACE OF ELSE in (if else) statements and can be placed anywhere in code, 
				     //not necessarily at the end like "else"
				System.out.println("Invalid Score");
				
		}

		
	}

}
