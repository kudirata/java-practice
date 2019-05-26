package day51_InheritanceOverriding;

public class Yoga extends Exercise{

	
	public int perform(int minutes) {
		System.out.println("Yoga");
		return minutes * 5;
	}
}
