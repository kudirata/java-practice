package day50_Inheritance03;

public class TestAnimals {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		System.out.println();
		an.move(20);
		cat.move(201);
		dog.move(204);
		duck.move(210);
		

	}

}
