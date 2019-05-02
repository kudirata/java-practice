package day16_String_Manipulation3;

public class ReplaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpace = sentence.replace(" ", "");
		System.out.println(withNoSpace);
		
		System.out.println(sentence);
		System.out.println();
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
		
		// chaining - putting all replace statements in one line
		
		String mixed = "&^@#j$a-v|a@#$";
		//clean up mixed
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);//j$a-v|a
		
		mixed = mixed.replace("$", "");
		mixed = mixed.replace("-", "");
		mixed = mixed.replace("|", "");
		//mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("a", "");
		System.out.println(mixed);

		
		String result = "About 115,000,000 results (0.59 seconds)";
		
		// using string methods(replace, substring)
		// get 115,000,000
		
		// 1) USING REPLACE
		
		//result = result.replace("About ", "");
		
		//result = result.replace(" results (0.59 seconds)", "");
		
		//System.out.println(result);
		
		// using substring
		

		
		//2) USING SUBSTRING
		
		// Question: Get 115,000,000 from result
		
		result = result.replace("About ", "");//115,000,000 results (0.11 seconds)
		//result = result.replace(" results (0.66 seconds)", ""); might break when number changes
		result = result.substring(0, result.indexOf(" "));  // this line means it starts from beginning until it finds first space
		System.out.println(result);
		
		
		
	}

}
