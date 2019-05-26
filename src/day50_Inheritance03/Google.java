package day50_Inheritance03;

public class Google extends SearchEngine{

	public int search (String item) {
		System.out.println("Searching for: "+item);
		int resultsCount = item.length();
		return resultsCount;
	}
	//protected
	public void search (String item, String item2) {
		System.out.println("Searching for: "+item + ", "+ item2);
		int resultsCount = item.length() + item2.length();
		System.out.println("Total count: "+ resultsCount);
	}
	//default, protected
	public String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
	
}
