package day50_Inheritance03;

public class Dog extends Animal{

	public void speak() {
		System.out.println("Dog is saying woof woof");
	}
	public void move(int steps) {
		System.out.println("Dog is moving "+ steps + " steps");
	}
}
