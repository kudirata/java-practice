package day51_InheritanceOverriding;

public class Running extends Exercise{

	
	
	public int perform(int minutes) {
		System.out.println("Running");
		return minutes * 12;
	}
}
