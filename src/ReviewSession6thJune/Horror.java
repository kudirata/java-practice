package ReviewSession6thJune;


public class Horror extends Movies{

	public Horror(String rating, int idNumber, String title, Director director) {
		super(rating, idNumber, title, director);
	}

	@Override
	public double calcLateFees(int numberDays) {
		return numberDays*1.25;
	}

}
