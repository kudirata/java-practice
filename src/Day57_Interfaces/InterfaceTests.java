package Day57_Interfaces;

public class InterfaceTests {

	public static void main(String[] args) {
		//Electric el = new Electric(); cannot instantiate an interface
		
		Tesla t = new Tesla();
		BMWi8 i8 = new BMWi8();
		
		t.charge();
		i8.charge();
		
		t.drive();
		t.selfDrive();
		
		Electric el2 = new Tesla();
		
		Cat cat = new Cat();
		cat.keepAsPet();
		cat.play();
		Pet.feed("dry food");
	}
}
