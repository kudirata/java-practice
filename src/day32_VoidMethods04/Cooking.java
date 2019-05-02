package day32_VoidMethods04;

public class Cooking {

	/*
	 * Cooking 
    -> add something
    -> mix some seconds
    -> fry some minutes
    -> boil some minutes
    1) method name add
       -> return: void
       -> params: 1 String 
       -> print "Add something"
       add("oil"); "Add oil"
       add("oil, onions");"Add oil, onions"
    2) mix
       -> param: 1 int seconds
       "Mix for 10 seconds"
       
    3) 4 is similar to above
	 * 
	 */
	
		
	public static void main(String[] args) {
		makePancakes();
		makePasta();
		makePancakes();
		cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");
	}
	
	public static void cook(String dish, String ingredients) {
		System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~"+dish.toUpperCase()+" IS READY!~~");
		//we could also check value of dish and call matching method
		//if(dish.equals("pancakes")) {
		//	makePancakes();
		//}
	}
	
	public static void makePasta() {
		System.out.println("~~ITALIAN PASTA RECIPE~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
		System.out.println("~~ DELICIOUS PASTA IS READY~~");
	}
	
	public static void makePancakes() {
		System.out.println("~~PANCAKES RECIPE~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~ ENJOY YOUR DELICIOUS PANCAKES ~~");
	}
	
	public static void add(String ing) {
		System.out.println("Add " + ing);
	}
	
	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}
	
	public static void fry(int minutes) {
		System.out.println("Fry for " + minutes + " minutes");
	}
	
	public static void boil(int minutes) {
		System.out.println("Boil it for " + minutes + " minutes");
	}
	
}