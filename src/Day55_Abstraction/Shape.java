package Day55_Abstraction;

public abstract class Shape {

	String name;
	double area;
	
	public Shape(String name) {
		super();
		this.name = name;	
	}
	
	public abstract double calculateArea();
	
	public abstract void draw();
}
