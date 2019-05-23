package day49_2_Inheritance02;

import day49_Inheritance02.Device;

//Ipad is a device. IPad is a sub-class in a different package
public class IPad extends Device {

	public void readEBook(String title) {
		
		System.out.println("Reading a Book "+ title + " using "+ brand + " tablet");
		System.out.println("Model - "+ model);
		
		//System.out.println();
		
	}
	
}
