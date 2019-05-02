package day20_Loop;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		// PRINT "LOVE JAVA" 10 TIMES
		
		for (i = 1; i <= 10; i++) {
			System.out.println("LOVE JAVA "+ i);
		}
		
		System.out.println();
		
		// PRINT 5 TO 15
		
		int j;
		for(j = 5; j <= 15; j ++) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		// PRINT REVERSE
		
		for (int j2 = 10; j2 >= 0; j2--) {
			System.out.print(j2 + ", ");
		}
		
	}

}
