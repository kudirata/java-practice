package Day63_Exceptions02;

//CUSTOM CHECKED EXCEPTION. EXTENDS EXCEPTION

public class NeedSomeCoffeeException extends Exception {
	public NeedSomeCoffeeException() {}
	
	public NeedSomeCoffeeException(String message) {
		super(message);
	}
}