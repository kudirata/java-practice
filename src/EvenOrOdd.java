
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for(i = 1; i <=100; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int k = 2; k <=100; k+=2) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		
		
		// USING if statements 
		//using for loop: 1-100
		//1.print all even numbers in same line
		
		
				for(int n = 1; n <= 100; n++) {
					if(n % 2 == 0) {             //check if it is even
						System.out.print(n+" ");
					}
				}
				
				System.out.println();
				//2.print all odd numbers in same line
				for(int j = 1; j <= 100; j++) {
					if(j % 2 != 0) {                         // DECLARES ODD NUMBERS
						System.out.print(j +" ");
					}
				}
				System.out.println();
				
		//3.sumOfOdds, sumOfEvens -  calculate them
		// and print out after the loop
		//sum of 1 - 10
		//1+2+3+4+5+6+7+8+9+10
				
				System.out.println();
				int sumOfOdds = 0;
				int sumOfEvens = 0;
				
				for(int num = 1; num <= 100; num++) {
					if(num % 2 == 0) {                 // DECLARES EVEN NUMBERS
						sumOfEvens += num;
						
						
					}else {
						sumOfOdds += num;
						
					}
				}
				
				System.out.println("SUM OF EVENS: "+sumOfEvens);
				System.out.println("SUM OF ODDS: "+sumOfOdds);
				
				System.out.println();
				
		// FOR LOOP: 1 - 7
		// 1 - MONDAY
		// 2 - TUESDAY
				
				for(int day = 1; day <=7; day ++) {
					switch (day) {
					case 1:
						System.out.println(day + " - Monday");
						break;
						
					case 2:
						System.out.println(day + " - Tuesday");
						break;
						
					case 3:
						System.out.println(day + " - Wednesday");
						break;
						
					case 4:
						System.out.println(day + " - Thursday");
						break;
						
					case 5:
						System.out.println(day + " - Friday");
						break;
						
					case 6:
						System.out.println(day + " - Saturday");
						break;
						
					case 7:
						System.out.println(day + " - Sunday");
						break;
					
					}
					
					
					
				}

	}

}
