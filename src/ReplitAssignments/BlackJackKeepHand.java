package ReplitAssignments;

import java.util.Scanner;

public class BlackJackKeepHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s = new Scanner(System.in);
		    
		    
		    int house = s.nextInt();
		    int player = s.nextInt();
		    int cardTotal = 0;
		    
		    //your code here

		 // if(cardTotal > 21) {
		   // System.out.println("output: bust");
		  if(player == house) {
		    System.out.println("output: its a tie");
		  }else if(house >= player) {
		    System.out.println("output: player loss");
		  }else if(player >= 21 && player >= house) {
		    System.out.println("output: bust");
		  }else if(player >= house) {
		    System.out.println("output: player wins");
		    
		  }


		  
			  

		
		

	}

}
