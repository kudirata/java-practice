package Day60_POLYMORPHISM02;

public class IPad extends AppleDevice{
	
	public double maxScreenSize = 12.9;
	
	@Override
	public void use() {
		System.out.println("IPad | Music | Read Book | Cartoon");
	}
	
	public void draw() {
		System.out.println("Drawing shapes using IPad");
	}

}
