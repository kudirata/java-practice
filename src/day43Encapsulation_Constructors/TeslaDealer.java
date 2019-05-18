package day43Encapsulation_Constructors;

public class TeslaDealer {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Tesla tesla = new Tesla();
		
		tesla.setModel ("Model 3");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		//print out using getter 
		
		System.out.println("Model: "+ tesla.getModel());
		
		System.out.println("Range: "+ tesla.getRange());
		
		System.out.println("ZeroTo60: "+ tesla.getZeroTo60());
		
		System.out.println("Price: "+ tesla.getPrice());
		
		System.out.println("SelfDriving: "+ tesla.isSelfDriving());
		
		System.out.println();
		System.out.println(tesla); // automatically calling toString method
		
		System.out.println(tesla.toString());
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		//tesla , myTesla
		if(tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getModel());
			System.out.println("0-60 speed: " + myTesla.getZeroTo60());
		}else {
			System.out.println("Faster model: " + tesla.getModel());
			System.out.println("0-60 speed: " + tesla.getZeroTo60());
		}
		
		buy(myTesla);
		buy(tesla);
		System.out.println(testDrive("Model s"));
		Tesla testCar	= testDrive("Model 3");
		System.out.println(testCar.toString());
		
		//main method
		// car = myTesla
	}
	
	
	public static Tesla testDrive(String model) {
		System.out.println(" - Hi I would like to test drive - "+ model);
		System.out.println(" - Sure, let me build the object and return it");
		
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);
		return car;
		
	}
	
public static void buy(Tesla car) {
	
	System.out.println("Purchasing: "+ car.toString());
	
	}
}