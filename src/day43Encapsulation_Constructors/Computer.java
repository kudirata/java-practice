package day43Encapsulation_Constructors;

public class Computer {
	
	private String brand;
	private String os;
	private double price;
	
	// right click --> source ---> Generate toString() to get line 18
	
	//add constructor
	public String toString() {
		return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public void setBrand(String string, String string2, double d) {
		// TODO Auto-generated method stub
		
	}
}
