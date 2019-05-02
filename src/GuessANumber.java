import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// add version 2 to code only 5 attempts
		
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();   // is used to generate random numbers
		
		System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
		
		int secretNumber = 83;
		int guessNumber;
		
		do {
			System.out.println("Guess a number:");
			guessNumber = scan.nextInt();
			if(guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
		}while(guessNumber != secretNumber);
		
		System.out.println("Bingo, Congratulations, you won!");
		
	}
}