package ReviewSession6thJune;

public class Fantasy extends Movies {

	public Fantasy(String rating, int idNumber, String title, Director director) {
		super(rating, idNumber, title, director);
	}

	@Override
	public double calcLateFees(int numberDays) {
		return numberDays * 3.5;
	}

}
