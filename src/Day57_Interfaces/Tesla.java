package Day57_Interfaces;

public class Tesla extends Vehicle implements Electric, Autonomous{
	public void charge() {
		
		System.out.println("Tesla is charging at charging station ");
	}
	
	public void selfDrive() {
		System.out.println("Tesla is in auto pilot mode. Driving autonomous ");
	}
	
}
