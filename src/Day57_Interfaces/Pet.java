package Day57_Interfaces;

public interface Pet {

	public static final boolean friendly = true; //'friendly' can also be uppercase
	
	public abstract void keepAsPet();
	
	public default void play() {
		System.out.println("Playing hide-and-seek with a pet");
		
	}
	//static methods in interface are not inherited to other classes
	public static void feed(String food) {
		System.out.println("Feeding a pet with "+ food);
	}
	
	
}
