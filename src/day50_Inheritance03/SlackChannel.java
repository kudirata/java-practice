package day50_Inheritance03;

public class SlackChannel {

	public static void main(String[] args) {
		
		SlackUser su = new SlackUser("Nadir");
		AdminUser au = new AdminUser("Florian");
		
		su.sendAMessage("This Thursday we will summarize JIRA");
		au.sendAMessage("Thank you.");

	}

}
