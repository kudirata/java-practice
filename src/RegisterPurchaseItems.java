import java.util.Scanner;

public class RegisterPurchaseItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a program called Register.

		It will ask user how many items he purchased.

		Then based on that number it will ask item name and price that many times.

		You need to gather all items in one String variable items separated by comma

		And calculate sum of each item price into variable totalPrice.

		Then print out items and total price.

		Example:

		How many items are you purchasing?

		2

		What is item 1?

		Gloves

		How much is Gloves?

		10.44

		What is item 2?

		Hat

		How much is Hat?

		13

		----------

		Your items: Gloves, Hat

		Your total Price: $23.44
		*/
		
		Scanner scan = new Scanner (System.in);
		
System.out.println("Welcome, how many items are you purchasing today?");
        
        int itemsCount = scan.nextInt();
        double totalPrice = 0.0;
        String items = "";
        
        for(int count = 1; count <= itemsCount; count++) {
            System.out.println("What is item "+count + "?");
            String itemName = scan.next();
            
            System.out.println("How much is " + itemName + "?");
            double itemPrice = scan.nextDouble();
            //add itemName to items and itemPrice to totalPrice
            items += itemName + ", ";
            totalPrice += itemPrice;    
        }
        if(items.endsWith(", ")) {
            //get rid of that ", "
        }
        System.out.println("Your items: " + items);
        System.out.println("Your total Price: $" + totalPrice);
    


	}

}
