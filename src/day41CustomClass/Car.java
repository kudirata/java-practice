package day41CustomClass;

import java.util.*;

public class Car {

	/*
	 * Custom class Car
	**instance variable/attributes/properties/data:
	make
	model
	currentSpeed
	color

	**methods
	printCarInfo()
		"car make[make], model[model], color[color], currentSpeed[currentSpeed]"

    showCurrentSpeed
   		return: void
   		param: int speedLimit
   		"Ford is driving at currentSpeed mph, following speed limit - 55"
   		"Ford is driving at currentSpeed mph, over the speed limit - 55"
	 * 
	 * 
	 */
	
	
	
	String make;
	String model;
	int currentSpeed;
	String color;
	
	public void printCarInfo() {
		String info = "Car make["+make+"], model[" + model +
				"], color["+color+"], currentSpeed["+currentSpeed+"]";
		System.out.println(info);
	}
	//"Ford is driving at currentSpeed mph, following speed limit - 55"
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, following the speed limit -" + speedLimit);
		}else {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, over the speed limit -" + speedLimit);
		}
	}
	
	public void drive() {
		System.out.println(make + " " + model + " is driving ...");
		
	}
		
		public void accelerate(int mph) {
			currentSpeed = currentSpeed + mph; //currentSpeed += mph
		}
		
	
	}



