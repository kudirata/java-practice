package day24_Arrays;

public class Cities {

	public static void main(String[] args) {
		
		// PRINT ALL CITIES THAT START WITH 'M'
		
		String[] cities = {"Washington D.C.", "Kiev", "Annandale", "Moscow", "Baku", "Istanbul", "Miami", "Silver Spring", "Mclean"};
		
		for (int i = 0; i < cities.length; i++) {
			
			if(cities[i].startsWith("M")) {
			
				System.out.println(cities[i]);	
			}
			
		}
		System.out.println();
		
		// OR USE THIS LOOP BELOW same thing, with for each loop
		
        for(String city: cities) {
            if (city.startsWith("M")) {
                System.out.println(city);
            }
        }

	}

}
