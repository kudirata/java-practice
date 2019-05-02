package day10_logicalOperators_Conditionals;

public class IfStatementWithBooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isBreakTime = true;
		
		if(isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
			
		}else {
			System.out.println("Not Break Time yet.");
		}
		
		
		//SECOND VERSION
		
		if(isBreakTime) {  // "== true" is removed and Java still accepts
			
			System.out.println("BREAK TILL 8:35 PM");
			
		}else {
			System.out.println("Not Break Time yet.");
		}
		
		boolean qualified = false;
		//send notification message only if not qualified
		//we need to check if qualified variable contains FALSE
		//TRUE
		
		if (qualified == false) {
			System.out.println("Your application was not approved. Thank you!");
		}
				
		
		
		
	}

}
