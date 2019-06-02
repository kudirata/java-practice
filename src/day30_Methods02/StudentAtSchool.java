package day30_Methods02;

public class StudentAtSchool {
	
	public static void main(String[] args) {
		study("Git");
		study("JAVA, JAVA");
		
		System.out.println();
		sleep(5);	
	}
	
	public static void study(String topic) {
		System.out.println("Student is studying "+topic);
	}
	
	public static void sleep(int hours) {
		System.out.println("Student has been sleeping for "+hours+" hours.");
	}

}