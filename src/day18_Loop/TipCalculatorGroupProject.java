package day18_Loop;
import java.util.*;
public class TipCalculatorGroupProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

				int numPeople;
				boolean split = false;
				double check, tip;
				String serviceQuestion, splitQuestion;

				Scanner scan = new Scanner(System.in);
				
				//Display a statement to ask the user if the check is split and convert the response to a boolean
				System.out.println("Split:");
				splitQuestion = scan.next().toLowerCase();

				if (splitQuestion.equals("yes")) 
					split = true;
				
				if (splitQuestion.equals("no")) 
					split = false;
				
				//We use a scanner to determine the number of people
				//then we use a switch statement to display the number of people using ampersands
				System.out.println("Number of people:");// (Max.10)
				numPeople = scan.nextInt();
				
				String people = "";
				if(numPeople<=0) {
					System.out.println("Um Hello!? you can't have food for 0 people.");
					
					return;
				}else if (numPeople>0) 
				{
				switch (numPeople) {
				case 1:
					people = "&";
					break;
				case 2:
					people = "&&";
					break;
				case 3:
					people = "&&&";
					break;
				case 4:
					people = "&&&&";
					break;
				case 5:
					people = "&&&&&";
					break;
				case 6:
					people = "&&&&&&";
					break;
				case 7:
					people = "&&&&&&&";
					break;
				case 8:
					people = "&&&&&&&&";
					break;
				case 9:
					people = "&&&&&&&&&";
					break;
				case 10:
					people = "&&&&&&&&&&";
					break;
				default:
					people = "&&&&&&&&&&";
					break;
				}
			
				}
				System.out.println("Check amount:");
				check = scan.nextDouble();
				
				if(check<0) {
					System.out.println("Invalid amount");
					
					return;
				}
				

				System.out.println("Service Quality:");
				serviceQuestion = scan.next().toLowerCase();
				
				// poor = 5%, fair = 10%, good = 15%, great = 20%, excellent = 25%;
				//we use a scanner to get a string input from the user and we use that to calculate the tip % by using a switch statement
				
				switch (serviceQuestion) {
				case "excellent":
					tip = check * 0.25;
					break;
				case "great":
					tip = check * 0.2;
					break;
				case "good":
					tip = check * 0.15;
					break;
				case "fair":
					tip = check * .1;
					break;
				case "poor":
					tip = check * 0.05;
					break;
				default:
					System.out.println("How much would you like to tip?: $ ");
					double tip2 = scan.nextDouble();
					tip = tip2;
					break;
				}
				
				//We print out the details below, whether the bill is split or not
				System.out.println("Number of people entered: " + people);
				System.out.println("Total to pay: " + (check + tip));
				System.out.println("Total tip: " + tip);

				//We use an if statement below to print out the total bill and tip per person if the bill is split(true).
				if (split) {
					System.out.println("Total per person: " + ((check + tip) / numPeople));
					System.out.println("Tip per person: " + (tip / numPeople));
				} else {

				}

			}
		

	}


