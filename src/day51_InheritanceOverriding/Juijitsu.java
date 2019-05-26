package day51_InheritanceOverriding;

public class Juijitsu extends Exercise{

	
	public int perform(int minutes) {
		System.out.println("Juijitsu");
		return minutes * 12;
	}
}
