package day50_Inheritance03;

public class App {

	private String name;
	public static int count;  //adding a static variable
	
	public static void build(String language) {
		System.out.println("Building an App using "+ language);
	}
	
	
	//public app
	public App(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
