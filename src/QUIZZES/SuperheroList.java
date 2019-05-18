package QUIZZES;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperheroList {
	public static void main(String[] args) {
		
		
		SuperHero object = new SuperHero();
		ArrayList<String> superheroes = new ArrayList<String>();
		superheroes.addAll(Arrays.asList(object.superheroes));
	}
}
