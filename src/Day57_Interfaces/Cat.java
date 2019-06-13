package Day57_Interfaces;

public class Cat implements Pet, Callable{

	@Override
	public void respond() {
		System.out.println("Cat is responding meoww meoww");
	}

	@Override
	public void keepAsPet() {
		System.out.println("Cat is kept inside home");
	}

}
