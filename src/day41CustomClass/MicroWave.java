package day41CustomClass;

public class MicroWave {

	String brand;
	boolean isOn; // false
	
	public void turnOn() {
		
		if(isOn) {
			System.out.println(brand + " microwave is already on");
		}else {
			System.out.println("Turning on " + brand + " microwave");
			isOn = true;
		}
	}
	public void turnOff() {
		if(isOn == false) { // already OFF
			System.out.println(brand + " microwave is already OFF");
		}else {
			System.out.println("Turning OFF "+brand + " microwave");
			isOn = false;
		}
	}
	
	public void heat(String food) {
		if(isOn) {
			System.out.println("Heating " + food);
		}else {
			System.out.println("Microwave is OFF, cannot heat " + food);
		}
	}
	
}
