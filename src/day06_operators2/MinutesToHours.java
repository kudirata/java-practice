package day06_operators2;

public class MinutesToHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minutes;
		minutes = 125;
		int hours = minutes/60;
		
		int remainingMinutes = minutes%60;
		
		System.out.println(hours);
		System.out.println(remainingMinutes);
		//print 2 hours and 5 minutes
		
		System.out.print(minutes+" minutes is ");
		
		System.out.println(hours+" hours and "+remainingMinutes+" minutes");
		
		int minutes2 = 66;
		
		minutes2 %= 60; //minutes2 = minutes % 60
		
		System.out.println("Remaining: " + minutes2);
		
		int pennies = 550;
		pennies %=100; //pennies = pennies % 100
		
		System.out.println("Pennies left: "+ pennies);
				
		
	}

}
