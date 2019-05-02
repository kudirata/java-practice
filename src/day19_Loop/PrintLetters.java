package day19_Loop;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Amazon";
		
		// print each xter one by one
		// ITERATION 1 IS TRUE, idx = 0 A
		// ITERATION 1 IS true  idx = 1 m
		
		int idx = 0;
		
		while(idx < word.length()) {     // STARTING FROM BEGINNING
			System.out.println(word.charAt(idx));
			idx++;
			
		}
		// print each xter in reverse order
		System.out.println();
		
		int idx2 = word.length() - 1;   // 5
		while(idx2 >= 0 ) {               // STARTING FROM END
			System.out.println(word.charAt(idx2));
			--idx2;
			
		}
		
		
		
		
	
	}
		
		
	
}
