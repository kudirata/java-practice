package day24_Arrays;

public class ArrayOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] values = {'a', 'b', 'c'};
		
		for (int i = 0; i < values.length; i++) {
			
			System.out.println(values[i]);
		}
		
		System.out.println("==========");
		
		String str = "Wooden Spoon";
		
		// this method toCharArray() converts string into array of characters
		
		char[] chars = str.toCharArray();
		for(char c:chars) {
			System.out.println(c);
		}
		
		System.out.println();
		
		str = "";
		
		for (int i = 0; i < chars.length; i++) {
			
		}
			for(int i = chars.length-1;i>=0;i--) {
			
			str += chars[i];
		}
		
		System.out.println(str);
		
		// PRINT XTERS WITH HELP OF ARRAYS ONE BY ONE IF XTER IS EQUAL TO 'O'
		
		//  replace it with '*' (print it instead of 'o') ;
		System.out.println();
		
        for(char c: chars) {
            if(c == 'o') {
                System.out.print("*");
            }else {
                System.out.print(c);
            }
        }
		
        System.out.println();
        char[] newChars = new char[3];
        System.out.println("Value of char: "+ newChars[0]);
        System.out.println(String.valueOf(newChars[0]));
        
		
		
	}

}
