package day27_Arrays;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a class called Times

declare 2 int arrays time1 and time2.
Both of them have 2 items/values that represent hour and minute.
hours:   0 - 23
minutes: 0 - 59

time1 = {11, 40}
time2 = {15, 25}
print "Time1 is earlier"

time1 = {11, 40}
time2 = {11, 25}
print "Time2 is earlier"

time1 = {11, 40}
time2 = {11, 40}
print "equal times"
		 *
		 */
		
		
		int time1 [] = new int[2];  // use new int if you don't know the value of the variable, similar to blank array with 2 elements. 0,0 value by default
		
		int time2 [] = new int[2] ;
		
		//System.out.println(time1[0]);
		
		time1[0] = 10;
		time1[1] = 15;
		
		
		time2[0] = 12;
		time2[1] = 10;
		
		// Before comparing check if both arrays have valid hours and valid minutes
		
		if(time1[0] < 0 || time1[0] > 23) {
			
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		if(time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invalid minute");
			return;
		}
		
		if(time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time2 has invalid hour");
			return;
		}
		
		if(time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has invalid minute");
			return;
		
		}
		
		// COMPARE ARRAYS AND TELL WHICH ONE IS EARLIER
		// COMPARE HOURS FIRST
		
		if(time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
			
		}else if(time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
			
		}else { // they have equal values here, next check minutes
			
			if(time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
				
			}else if(time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
				
			}else {
				
			}
			
			
		}
		
	}

}
