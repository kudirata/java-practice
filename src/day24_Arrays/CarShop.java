package day24_Arrays;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {

		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls Royce, Tesla

		// 1. Step: Create an array of strings, and store these cars inside that array.

		// 2. print car names that start with "M"

		// 3. print all cars that contain letter 'r' make your search case insensitive

		// 4. print car names that ends in a

		// 5. print car names with spelling greater than 6
		
		// 6. swap first and last value in the array
		

		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls Royce", "Tesla" };

		for (int i = 0; i < cars.length; i++) {

			if (cars[i].startsWith("M")) {

				System.out.println(cars[i]);
			}
		}
		System.out.println();

		for (String make : cars) {
			if (make.toLowerCase().contains("r")) {
				System.out.println(make);
			}
		}

		System.out.println();

		for (String make : cars) {
			if (make.endsWith("a")) {
				System.out.println(make);
			}
		}

		System.out.println();

		for (String make : cars) {
			if (make.length() > 6) {
				System.out.println(make);
			}
		}
		System.out.println("****************");
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].length() >= 6) {
				System.out.println(cars[i]);
			}
		}

		System.out.println("*************");
		
		String temp = cars[0];
		cars[0] = cars[cars.length - 1];
		cars[cars.length - 1] = temp;
		System.out.println(Arrays.toString(cars));
		
		}
		
	}


