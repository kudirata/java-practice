package ReviewSession1;

public class PrintUniqueString {

	public static void main(String[] args) {
		// Print unique string in word i.e. character that is not duplicated
		
		String str = "jjavabook"; //vbk
		
		//outer loop will take one char at a time
		for(int i = 0; i < str.length(); i++) {
			
			//read one char from str and store to temp
			char temp = str.charAt(i);// j
			
			//set count as 0 each time
			int count = 0;
			
			//inner loop will help compare with other chars
			for(int j = 0; j < str.length(); j++) {
				
				//compare each character with temp
				if(temp == str.charAt(j) && i != j ) {
					
					//System.out.println(temp + " is duplicated");
					//if it is a match, increase count by 1
					
					count++;
				}
			}
			//outside inner loop check if count is still 0
			//if count is 0 then temp is unique
			if(count == 0) {
				System.out.println(temp);
			}
		}
		
		
	}
}




