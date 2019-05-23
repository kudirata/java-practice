package day49_2_Inheritance02;

import day49_Inheritance02.Device;

// Non-sub class in different package
public class OverseasFactory {

	public static void main(String[] args) {
		
		Device dv = new Device();
		dv.brand = "Samsung";
		//dv.model = "3200"; this is not visible because it's protected
		//dv.price = 1000; not visible

	}

}
