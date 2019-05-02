package day15_String_Manipulation;

public class IndexOf {

	public static void main(String[] args) {
		// indexOf Looks for a xter or string within the string and returns the first position if found. 
		// Returns (-1) if not found.
		
		String word1 = "github";
		System.out.println(word1.indexOf("g"));   // 0
		System.out.println(word1.indexOf("th"));  // 2
		System.out.println(word1.indexOf("hub")); // 3
		
		System.out.println(word1.indexOf("java"));
		System.out.println();
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("Position of . :"+ i);
		System.out.println(url.charAt(i +2));
		
		System.out.println();
		
		String title = "Java - Google search";
		
		// find position of '-' and check if space is on right and left sides.
		
		int dash = title.indexOf("-");  // 5
		System.out.println(title.charAt(dash - 2)); // " "
		
		System.out.println(title.charAt(dash + 2)); // " "
		System.out.println();
		
		String country = "United states of America";
		int states = country.indexOf("states");
		System.out.println("Position of states "+states);
		
		System.out.println();
		
		String word2 = "java, c++, python, tomcat, eclipse ";
		
		// check if c++ is in word2
		
		if (word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ missing");
		}
		
		System.out.println();
		// USING INDEX OF
		
		if (word2.indexOf("c++") > -1) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		
		
		
		}
		

	}


