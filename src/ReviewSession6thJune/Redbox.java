package ReviewSession6thJune;

public class Redbox {
	public static void main(String[] args) {
		Director director1 = new Director("Anthony Russo");
		Director director2 = new Director("Bradley Cooper");
		
		Fantasy avengers = new Fantasy("PG-13", 1, "Avengers: Endgame", director1);
		
		Drama astarisborn = new Drama("R", 2, "A Star Is Born", director2);
		System.out.println(avengers.calcLateFees(5));
		System.out.println(astarisborn.calcLateFees(5));
		
		Fantasy avangers2 = new Fantasy("PG-3", 1, "Avengers", director1);
		System.out.println(avengers.equals(avangers2));
	}
}
