package day25_Arrays;

public class PolpulationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] cities = {"Miami", "London", "Tokyo", "Rome", "New York"};
		
		int[] population = new int[5];
		
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[4] = 8907;
		population[3] = 4455;
		
		// int[] population = {5000, 10000, 7000, 4455, 8907};
		
		int[] population2 = {5000, 5000 * 2, 7000, 4455, 8907};
		
		
		System.out.println("City 0 population:" + population[0]);
		System.out.println("City 1 population:" + population[1]);
		System.out.println("City 2 population:" + population[2]);
		System.out.println("City 3 population:" + population[3]);
		System.out.println("City 4 population:" + population[4]);
		
		System.out.println();
		int idx = 0;
		
		System.out.println("City 0 population:" + population[idx]);
		idx++;
		System.out.println("City 1 population:" + population[4]);
		
		String str = "abc";
		System.out.println("City str.length() population:" + population[str.length()]);
		
		System.out.println();
		// population of Miami is 5000
		// population of London is 10000
		// population of Tokyo is 7000
		// population of Rome is 4455
		// population of New York is 8907
		
		
		System.out.println("Population of " + cities[0] + " is " + population[0]);
		System.out.println("Population of " + cities[1] + " is " + population[1]);
		System.out.println("Population of " + cities[2] + " is " + population[2]);
		System.out.println("Population of " + cities[3] + " is " + population[3]);
		System.out.println("Population of " + cities[4] + " is " + population[4]);

	}

}
