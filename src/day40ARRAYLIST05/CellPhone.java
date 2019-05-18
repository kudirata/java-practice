package day40ARRAYLIST05;

public class CellPhone {

	
		
		String brand = "";
		double screenSize = 0.0; 
		String color = ""; 
		double price = 0.0;
		
		public static void main(String[] args) {
			
			
			//System.out.println(brand);
			// create cell phone object to store more data (advantage of creating class)
			
			CellPhone cell1 = new CellPhone();
			
			System.out.println(cell1.brand);
			
			System.out.println(cell1.screenSize);
			
			cell1.brand = "Nokia 6300";
			cell1.screenSize = 2.0;
			cell1.color = "silver";
			cell1.price = 76.16;
			
			System.out.println("Brand: " + cell1.brand);
			
			System.out.println("screenSize: " + cell1.screenSize);
			
			System.out.println("color: " + cell1.color);
			
			System.out.println("price: " + cell1.price);
			
			

			cell1.color = "Black";
			System.out.println("color: " + cell1.color);
			
			CellPhone cell2 = new CellPhone();
			cell2.brand = "Siemens";
			cell2.screenSize = 1.5;
			cell2.color = "blue";
			cell2.price = 39.22;
			
			System.out.println("##### CELL 2 VALUES #####");
			System.out.println("Brand: " + cell2.brand);
			System.out.println("screenSize: " + cell2.screenSize);
			System.out.println("color: " + cell2.color);
			System.out.println("price: " + cell2.price);
			
			
			System.out.println("#### CALLING METHODS ####");
			cell1.call();
			cell1.message();
			cell1.takeAPhoto();
			
			cell2.call();
			cell2.message();
			cell2.call();
			cell2.takeAPhoto();
			
		}

		void takeAPhoto() {
			// TODO Auto-generated method stub
			
		}

		void message() {
			// TODO Auto-generated method stub
			
		}

		public void call() {
			// TODO Auto-generated method stub
			
		}

	}


