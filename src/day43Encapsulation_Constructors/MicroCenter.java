package day43Encapsulation_Constructors;

public class MicroCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer comp1 = new Computer();
		
		Computer comp2 = new Computer();
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		comp1.setBrand("iMac");
		comp1.setOs("macOs High Sierra");
		comp1.setPrice(2567);
		
		comp2.setBrand("Dell XPS");
		comp2.setOs("Windows 10");
		comp2.setPrice(1300);
		
		Computer comp3 = new Computer();
		comp3.setBrand("ASUS", "WINDOWS 7", 645.5);
		
		
		System.out.println(comp3.toString());
		
		comp3.setOs("Windows 11");
		System.out.println(comp3.toString());
		
		comp3.setPrice(comp3.getPrice() - 200);
		System.out.println(comp3.toString());

	}

}
