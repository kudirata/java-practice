package Day59_POLYMORPHISM;

public class ShapeTests {

	public static void main(String[] args) {
		Shape shape1 = new Shape();
		shape1.draw();
		
		Shape circle = new Circle();
		circle.draw();
		Shape triangle = new Triangle();
		triangle.draw();
	}
}
