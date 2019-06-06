package ReviewSession1;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n1 = "talent "; //Line1
		String n2 = n1 + "cookie "; //Line2
		n1.concat("where "); //Line3
		n2.concat(n1); //Line4
		n2 += "where talent gets "; //Line5
		System.out.println(n2 +"nourishment");
		
	}

}
