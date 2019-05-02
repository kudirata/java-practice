package day18_Loop;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letter = 'a';
		while(letter <= 'z') {
			System.out.print(letter + " ");  // ADD SPACE IN BETWEEN THE ALPHABETS
			letter++;
		}
		System.out.println();
		char capitals = 'A';
		while (capitals <= 'Z')  {
			System.out.print(capitals + " ");  // ADD SPACE IN BETWEEN THE ALPHABETS
			capitals++;
		}
		
		System.out.println();
		
		char letter2 = 'z';
		while(letter2 >= 'a') {
			System.out.print(letter2 + " ");  // ADD SPACE IN BETWEEN THE ALPHABETS
			letter2--;
		}
		
		System.out.println();
		String letters = "";
		letters = letters + 'A';
		System.out.println();
		
		letters = letters + 'B';
		System.out.println(letters);
		
		letters = letters + 'C';
		System.out.println(letters);
		
		letters = letters + 'D';
		System.out.println(letters);
		
		letters = letters + 'E';
		System.out.println(letters);
		System.out.println();
		
		char myLetter = 'A';
		while( myLetter <= 'Z') {
			letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;
		}
		
		
		
		
	}

}
