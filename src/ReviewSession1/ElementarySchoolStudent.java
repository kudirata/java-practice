package ReviewSession1;

public class ElementarySchoolStudent extends Student{

	public ElementarySchoolStudent(String school) {
		super(school);
	}
	
	public String toString() {
		return "elementary school "+super.toString();
	}

}
