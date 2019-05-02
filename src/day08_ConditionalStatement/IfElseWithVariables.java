package day08_ConditionalStatement;

public class IfElseWithVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperature = 45;
		if(temperature >= 65) {
			System.out.println("It's a nice day! Let's code Java");
		}else {
			System.out.println("Stay home and code Java");
		}
		
		System.out.println();
		// 2 int variables, teamAScore, teamBScore
		//put a condition. Check if team won.
		//"Team A won".
		//Go to Team A!
		//else "teamb won or it was a draw"
		// Go Teams!
		
		
		int teamAScore = 30;  //change to 20 and see result
		int teamBScore = 20;
		
		if(teamAScore > teamBScore ) {
		
		System.out.println("Team A won");
		System.out.println("Go Team A!");
	}else {
		System.out.println("Team B won or it was a draw");
		System.out.println("Go Teams!");
	}
		
		

	}

}
