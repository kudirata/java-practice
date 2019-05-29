package day53_Inheritance06;

public class Cities {

	public static void main(String[] args) {
		City Baku = new City(123, "Baku");

		System.out.println(Baku.toString());
		
		City Istanbul = new City(444, "Istanbul");
		City anotherCity = new City(444, "Istanbul");
		
		if(Istanbul.equals(anotherCity)) {
			System.out.println("Both are Istanbul");
		}else {
			System.out.println("Does not equal");
		}
		
		System.out.println(Istanbul.toString());
		System.out.println(anotherCity.toString());
		
		System.out.println(Baku.hashCode());
		System.out.println(Istanbul.hashCode());
		System.out.println(anotherCity.hashCode());
		
		Capital cap = new Capital(101, "Washington DC", 800_000L);
		System.out.println(cap.toString());
	}

}
