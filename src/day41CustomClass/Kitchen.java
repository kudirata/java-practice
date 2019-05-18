package day41CustomClass;

public class Kitchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MicroWave mic = new MicroWave();
		mic.brand = "LG";
		mic.turnOn();
		mic.heat("pizza with mushroom & anchovies");
		mic.turnOff();
		
		

	}

}
