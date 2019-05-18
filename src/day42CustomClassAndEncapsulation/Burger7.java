package day42CustomClassAndEncapsulation;

import java.util.Arrays;

public class Burger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Burger burger1 = new Burger();
        burger1.name = "COWBOY";
        String[] ings = {"onion crisps", "american cheese", 
                       "pickles", "lettuce", "b7 sauce"};
        burger1.ingredients = ings;
        
        System.out.println(burger1.name);
        System.out.println(Arrays.deepToString(burger1.ingredients));
        System.out.println(burger1.ingredients[0]);
        
        System.out.println();
        
        for(String ing : burger1.ingredients) {
        	System.out.print(ing +" ");
        }
        

        //Or using for loop
       // for (int i = 0; i < burger1.ingredients.length; i++) {
			//System.out.println((i+1) + " ingredients: " + burger1.ingredients[i]);        
        

	}

}
