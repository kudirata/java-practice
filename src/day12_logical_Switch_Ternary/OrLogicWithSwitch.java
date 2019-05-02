package day12_logical_Switch_Ternary;

public class OrLogicWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A OR B OR C ---> PASS
		
		char grade = 'P';
		//A or B or C -> Pass    D , E -> Fail   Invalid grade
		
		switch(grade) {
			case 'A':
			case 'B':
			case 'C':
				System.out.println("Pass");
				break;
			case 'D':
			case 'E':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Invalid grade");
			
		}
		
		
		
		
		

	}

}
