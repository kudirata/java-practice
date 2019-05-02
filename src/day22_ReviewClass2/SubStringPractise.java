package day22_ReviewClass2;

public class SubStringPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "java";
		System.out.println(word.substring(0,2));  // ja
		
		System.out.println();
		
		// print each xter in separate line using substring
		
		System.out.println(word.substring(0,1));
		
		System.out.println(word.substring(1,2));
		
		System.out.println(word.substring(2,3));
		
		System.out.println(word.substring(3,4));
		
		// System.out.println(word.substring(4,5));  ERROR
		
		System.out.println();
		
		int i = 0;
		System.out.println(word.substring(i, i + 1));
		i++;
		
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		
		System.out.println("########FOR LOOP########");
		
		// USING FOR LOOP & SUBSTRING PRINT EACH CHARACTER
		// java
		// 0123
		
		for(int n = 0; n <= 3; n++) {
			//System.out.println(word.substring(n, n+1)); This or
			String letter = word.substring(n, n+1);
			
			System.out.println(letter);
		
		}
		
		System.out.println("########REVERSE#########");
		// PRINT LETTERS IN REVERSE
		
		for(int n = 3; n >= 0; n--) {
			System.out.println(word.substring(n, n+1));
		}
		
		System.out.println();
		int start = 1;
		int end = 5;
		String word2 = "UnitedStates";
		
		System.out.println(word2.substring(start, end));
		
		System.out.println(word2.substring(2, 3)); // i
		
		System.out.println(word2.substring(6, 7));//S
		//pass single input. start only and will include until last char
		System.out.println(word2.substring(6));
		//print last character
		              //01234
		String word3 = "apple";
		System.out.println(word3.substring( word3.length()-1 ));
		

	}

}
