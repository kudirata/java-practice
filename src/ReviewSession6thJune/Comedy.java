package ReviewSession6thJune;

public class Comedy extends Movies{

	public Comedy(String rating, int idNumber, String title, Director director) {
		super(rating, idNumber, title, director);
	}

	@Override
	public double calcLateFees(int numberDays) {
		return numberDays*2.5;
	}

}