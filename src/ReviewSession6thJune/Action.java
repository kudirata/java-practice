package ReviewSession6thJune;

public class Action extends Movies{

	public Action(String rating, int idNumber, String title, Director director) {
		super(rating, idNumber, title, director);
	}

	
	public double calcLateFees(int numberDays) {
		return numberDays*3;
	}

}
