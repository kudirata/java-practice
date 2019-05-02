package ReplitAssignments;

public class PrintsUniqueWords153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};
		printUniqueWords(words);

	}
	public static void printUniqueWords (String[] words) {
		String temp = "";
		
		boolean unique;
		
		for (int i = 0; i < words.length; i++) {
			unique = true;
			temp = words[i];
			
			for (int j = 0; j < words.length; j++) {
				if(j == i) {
					continue;
					
				}else if(temp.contentEquals(words[j])) {
					unique = false;
					break;
					
				}
				
			}
			
			if(unique == true) {
				System.out.println(temp);
			}
		}
	}

}
