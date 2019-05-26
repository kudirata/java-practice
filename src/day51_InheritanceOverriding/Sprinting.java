package day51_InheritanceOverriding;

public class Sprinting extends Exercise {

	public int perform(int minutes) {
		System.out.println("Sprinting");
		return minutes * 12;
	}
}
