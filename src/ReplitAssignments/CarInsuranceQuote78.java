package ReplitAssignments;

import java.util.*;

public class CarInsuranceQuote78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    //DO NOT CHANGE
		    double premium = 0;
				int accidentsAmount = 0;
				int daysDrivenToWorkOrSchool = 0;
				int milesToWorkOrSchool = 0;
				String vehicleOwnership = "";
				String vehicleUsage = "";
				String continuousInsurance = "";
				String education = "";
				String name = "";
				String referenceNumber = "";
				Scanner scan = new Scanner(System.in);
				System.out.println("Welcome to the CountyFarm car insurance!");
		    //WRITE YOUR CODE HERE
		    
		    //		DOCUMENTATION AND STYLE 
//				1) Meaningful Variable Names
//				2) Comments
//				3) Indentation
//				4) Using Named Constant

		// SHORTCUTSl
		//To see all shortcuts use "ctrl + shift + l" on windows, "Command + shift + l" on mac
		//To create new packet, click "src" than click new package at the top, for new class click package name than click new clase at the top 
		//To convert selected line to comment, click anywhere on the code line than use "ctrl + /"
		//To convert selected lines to comment, select code lines than use "ctrl + shift + /" 
		//To format source code, use "ctrl + shift + f" on windows, "Command + Shift + F" on mac
		//To change variable, class, package name use (alt + shift + r) on windows (Command + Option + R) on mac
		//To run program, (ctrl+f11) on windows, (Command + fn + F11) on mac
		//To select any one word double click on it
		//To complete any command (ctrl + space) on windows, (control + space) on mac

		//DEBUGGING
		//Create debug point
		//debug source code
		//Track your variables


				System.out.println("Enter your name");
				name = scan.next();
				System.out.println("Do you have a US driver license?");
				String license = scan.next();
				if (license.equals("No")) {
					System.out.println("Invalid data!");
					System.exit(0);
				}
				System.out.println("Enter your zip code");
				int zipCode = 0;
				zipCode = scan.nextInt();
				if (zipCode == 20910 || zipCode == 20740) {
					premium += 60;
				} else if (zipCode == 22103 || zipCode == 22102) {
					premium += 30;
				} else {
					premium = 50;
				}

				System.out.println("Is this vehicle Owned, Financed, or Leased?");
				vehicleOwnership = scan.next();
				if (vehicleOwnership.equals("Owned")) {
					premium += 10;
				} else {
					premium += 20;
				}
				System.out.println("How is this vehicle primarily used?");
				vehicleUsage = scan.next();
				if (vehicleUsage.equals("Business")) {
					premium += 50;
				} else if (vehicleUsage.equals("Pleasure")) {
					premium += 10;
				} else if (vehicleUsage.equals("Commute")) {
					premium += 20;

					System.out.println("Days Driven To Work And/Or School");
					daysDrivenToWorkOrSchool = scan.nextInt();
					premium += daysDrivenToWorkOrSchool * 5;

					System.out.println("Miles Driven To Work And/Or School");
					milesToWorkOrSchool = scan.nextInt();
					premium += milesToWorkOrSchool;
				}
				System.out.println("How old are you?");
				int driverAge = scan.nextInt();
				if (driverAge < 16) {
					System.out.println("Invalid data!");
					System.exit(0);
				} else if (driverAge < 18) {
					premium += premium * 20;
				} else if (driverAge <= 21) {
					premium += premium * 6;
				} else if (driverAge < 25) {
					premium += premium * 2;
				}

				System.out.println("How many years you've been driving?");
				int experience = scan.nextInt();
				if (experience < 1 || (driverAge - experience) < 16) {
					System.out.println("Invalid data!");
					System.exit(0);
				} else {
					premium -= experience * 5;
				}

				System.out.println("Have you had any accidents in the last 5 years?");
				String accident = scan.next();
				if (accident.equalsIgnoreCase("yes")) {
					System.out.println("How many?");
					accidentsAmount = scan.nextInt();
					premium += premium * accidentsAmount * 0.2;
				}
				System.out.println("Have you had continuous insurance for the past 12 months?");
				continuousInsurance = scan.next();
				if (continuousInsurance.equals("No")) {
					premium += premium;
				}
				System.out.println("What is the highest level of education you have completed?");
				// Difference between next() and nextLine()
				scan.nextLine();
				education = scan.nextLine();
				if (education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters")) {
					premium -= premium * 0.05;
				} else if (education.equals("Doctors")) {
					premium -= premium * 0.1;
				} else if (education.equals("Less than High School")) {
					premium += premium * 0.05;
				}
				System.out.println(name + ", here's your quote!");
				System.out.println("Start Your Policy Today For: $" + premium);
				referenceNumber = name.substring(0, 2).toUpperCase() + driverAge
						+ name.substring(name.length() - 2).toUpperCase() + zipCode + education.replace(" ", "").toUpperCase();
				System.out.println("Reference number: " + referenceNumber);

				scan.close();


		  }
		
		
	}


