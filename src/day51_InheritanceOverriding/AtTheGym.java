package day51_InheritanceOverriding;

public class AtTheGym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercise e = new Exercise();
		Running rn = new Running();
		Swimming sw = new Swimming();
		Yoga yg = new Yoga();
		Juijitsu jj = new Juijitsu();
		Sprinting sp = new Sprinting();
		
		System.out.println(e.perform(30));
		System.out.println(rn.perform(40));
		System.out.println(sw.perform(45));
		System.out.println(yg.perform(60));
		System.out.println(jj.perform(60));
		System.out.println(sp.perform(25));
		
		Exercise e2 = new Exercise();
		System.out.println(e.perform(33));
		
		System.out.println("=============================");
		SnowBoarding sb = new SnowBoarding();
		System.out.println(sb.perform(100));
		
		
	}

}
