package day18_Loop;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfStudents = 1;
		
		// using a loop, iterate until we have 10 students in the room
		// student 1
		// student 2
		// ....
		// No more space
		
		while (numberOfStudents <= 10) {
			System.out.println("Student "+numberOfStudents);
			numberOfStudents++;
		}
		System.out.println("No more space");
		

	}

}
