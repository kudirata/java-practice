package Day55_Abstraction;

public class ShapeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle1 = new Circle(10);
		System.out.println("Calculated area of circle: " + circle1.calculateArea());
		circle1.draw();
		
		Triangle triangle1 = new Triangle(5, 5, 5); // This is equilateral triangle
		System.out.println("Area: " + triangle1.calculateArea());
		triangle1.draw();
		
	}

}
