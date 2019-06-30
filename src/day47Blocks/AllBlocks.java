package day47Blocks;

public class AllBlocks {

	int nonStaticInt = 10;
	static int staticInt = 10;

	static {
		System.out.println("STATIC BLOCK - IPad run first and only once");
		staticInt--;
	}

	{
		System.out.println("INIT BLOCK - IPad run each time object is created. Before constructor");
		nonStaticInt += 5;
		staticInt += 5;
	}

	public AllBlocks() {
		System.out.println("CONSTRUCTOR - IPad run each time object is created. after init block");
		nonStaticInt += 3;
		staticInt += 3;
	}

}