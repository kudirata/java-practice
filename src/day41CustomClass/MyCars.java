package day41CustomClass;

public class MyCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);
		//car1.drive();
		
		//System.out.println("before: "+ car1.currentSpeed);
		
		//car1.accelerate(20);
		
		//System.out.println("after: " + car1.currentSpeed);

	}

}