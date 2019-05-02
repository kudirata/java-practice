package day13_Ternary_Strings_Intro;

public class MoreTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		int PMHour = 1;
		//Rush hour during evening: 4 - 7
		boolean rushHour= (PMHour >= 4 && PMHour<= 7) ? true : false;
		
		//System.out.println(PMHour + " is rush hour? " + rushHour);
		//rushHour ==> true - yes
		//rushHour ==> false - no
		String result = rushHour==true ? "yes" : "no";
		
		System.out.println(PMHour + " is rush hour? " + result);
		
		int AMHour = 10; //6 - 9
		// 6 - 9 amRushHour - Yes, No
		String amRushHour = AMHour >= 6 && AMHour <= 9? "Yes" : "No"; 
		
		System.out.println(AMHour + " is rush hour? - " + amRushHour);
	}

}
