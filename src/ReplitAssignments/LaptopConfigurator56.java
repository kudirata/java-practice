package ReplitAssignments;
import java.util.*;
public class LaptopConfigurator56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  
		    double price = 0.0;
			
				String storageType, screenType, cpu;
				
				int ramSize = 0;
				
				Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE
		    
		     System.out.println("Select screen size:");
		     double screenSize = scan.nextDouble();
		     
		     if (screenSize == 13.3) {
		       price = price + 200;
		       //System.out.println("Laptop price is: "+price+"$");
		       
		     }else if(screenSize == 15.0) {
		       price = price + 300;
		       System.out.println("Laptop price is: "+price+"$");
		       
		     }else if (screenSize == 17.3) {
		       price = price + 400;
		       //System.out.println("Laptop price is: "+price+"$");
		       
		     }
		    
		     System.out.println("Select CPU type:");
		     cpu = scan.next();
		    
		    if(cpu .equals("i3")) {
		       price = price + 150;
		       //System.out.println("Laptop price is: "+price+"$");
		      
		    }else if(cpu .equals("i5")) {
		       price = price + 250;
		       System.out.println("Laptop price is: "+price+"$");
		       
		    }else if (cpu .equals("i7")) {
		       price = price + 350;
		       System.out.println("Laptop price is: "+price+"$");
		       
		    }   
		       
		    System.out.println("Select RAM size:");
		    ramSize = scan.nextInt();
		    
		    price += (ramSize / 4)* 50;
		    
		    System.out.println("Select storage type::");
		    storageType = scan.next();
		    
		    
		    
		    System.out.println("Enter memory size:");
		    int memory = scan.nextInt();
		    
		    if(storageType .equalsIgnoreCase("ssd")) {
		    	price += (memory / 500)* 100;
		    	
		    }else {
		    	price += (memory / 500)* 50;
		    }
		    
		    System.out.println("Enter screen resolution:");
		    String resolution = scan.next();
		    
		    if (resolution.equalsIgnoreCase("FULLHD")) {
		      price = price + 100;
		      
		    }else if (resolution.equalsIgnoreCase("4K")) {
		    	price = price + 200;
		    }
		    	
		    
		    System.out.println("Laptop price is: "+ price);
		    
		    
		    
		    
		    
		  }
		

	}


