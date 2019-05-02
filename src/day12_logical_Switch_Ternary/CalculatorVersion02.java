package day12_logical_Switch_Ternary;

import java.util.Scanner;

public class CalculatorVersion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s = new Scanner (System.in);
		
		System.out.println("Enter First Number");

	double num1, num2, result = 0.0; // assign 0.0 to result to avoid compile errors
	
	String operator;
	Scanner input;
		
	 num1 = s.nextDouble();
	 
	 System.out.println("Enter Second Number");
	 
	 num2 = s.nextDouble();
	 
	 System.out.println("Select Operator: +, -, *, /, % ");
	 
	 operator = s.next();
	 
	 
	
	switch (operator) {
	case "+":
		result = num1 + num2 ;
		break;
	case "-":
		result = num1 - num2 ;
		break;
		
	case "*":
		result = num1 * num2 ;
		break;
	case "/":
		
		result = num1 / num2 ;
		break;
		
	case "%":
		result = num1 % num2 ;  // modular operator % gives remainder
	
		
	default:
		System.out.println("Invalid Operator Selected: " + operator);
		return;   //means Do not execute remaining code, it won't print result for invalid operator
	}
	
	
	System.out.println("Result: "+result);
		
	}	
		
	

	}



		
		
