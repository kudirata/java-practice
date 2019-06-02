package ReviewSession1;

public class HighSchoolStudent extends Student{

	public HighSchoolStudent(String school) {
		super(school);
	}
	
	public String toString() {
		return "high school "+super.toString();
	}

}