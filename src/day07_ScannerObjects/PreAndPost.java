package day07_ScannerObjects;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		int num2 = num++;
		
		System.out.println("num: "+num);
		
		System.out.println("num2: "+num2);
		
		
		int n = 20;
		int n2 = ++n;
		
		System.out.println("n: "+n);
		System.out.println("n2: "+n2);
		
		
		
		int apples = 4;
		int pears = apples++;
		
		//the above statement means 
		pears = apples;
		apples = apples++;
		
		System.out.println("apples "+apples);
		System.out.println("pears "+pears);
		
		
		
		System.out.println("apples " + apples);
		
		
		
		int friends = 10;
		System.out.println(friends++);
		
		
		int p1 = 10;
		int sum = p1++ + 5;
		//p1 + 5 and assign to sum
		// p = p + 1
		
		System.out.println("sum: "+ sum);
		
		System.out.println("p1: "+ p1);
		
		
		
		
		int batteries = 8;
		int oldBatteries = 5;
		
		int totalBatteries = batteries++ + ++oldBatteries;  // 8 + 6 = 14
		
		System.out.println("totalBatteries "+ totalBatteries);
		
		
		
		
	}

}
