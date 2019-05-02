package day15_String_Manipulation;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1 = "eclipse";
		
		
		
		//starsWith, endsWith
		
		
		System.out.println(word1.startsWith("e"));
		
		System.out.println(word1.endsWith("e"));
		
		System.out.println(word1.endsWith("se"));
		
		System.out.println();
		
		// Mr. - man
		// Mrs.  - married woman
		// Ms. - some woman
		// Dr. - doctor man or woman
		
		String name = "Mrs. Jackson";
		if (name.startsWith("Mr.")) {
			System.out.println("man");
			
		}else if (name.startsWith("Mrs.")) {
			System.out.println("woman");
		}
		System.out.println();
		
		String item = "java";
		String pageTitle = item + " - Google search";
		
		if (pageTitle.startsWith(item)) {
			System.out.println("PASS: Page title check passed ");
		}else {
			System.out.println("FAIL: Pge title check failed");
		}
		
		if(pageTitle.endsWith("Google Search")) {
			System.out.println("PASS: Google search is in title");
		}else {
			System.out.println("FAIL: Google search is not in title");
		}

		
	}

}
