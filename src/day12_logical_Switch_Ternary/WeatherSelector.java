package day12_logical_Switch_Ternary;

import java.util.Scanner;

public class WeatherSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		System.out.println("How is the Weather today? ");
		String weather = s.next();
		
		switch (weather) {
		case "sunny":
		    System.out.println("Go to the Park");
		    System.out.println("Code Java");
		break; 
		
		case "hot":
			System.out.println("Go Swimming");
			System.out.println("Code Java");
			break; 
			
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break; 
			
		case "rainy":
			System.out.println("Go shopping");
			System.out.println("Code Java");
			break; 
			
		case "snowy":
			System.out.println("Chain your tyres");
			System.out.println("Go Skiing");
			System.out.println("Code Java");
			break;
			
			default:
				System.out.println("Code Java in any weather");
			
		}

		System.out.println("##### END OF PROGRAM #####");
		
		
	}

}
