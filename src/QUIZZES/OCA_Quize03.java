package QUIZZES;

//import packageName.classname;
//import static packagename.classname.variablename;  
//import static packagename.classname.*;

import java.util.Arrays;

public class OCA_Quize03 {
	
	
	public static void main(String[] args) {	
		
		
		/*
		 	
		 	1. What's the result of the following code fragment?

				public static void main(String[] args) {

                       String str1 = "Java";      
                      String[] str2 = {"J","a","v","a"};
               
                        String str3 ="";  
		               for(int i=0; i<str2.length; i++) {
		                         str3 += str2[i];
		                     }
		              	boolean b1 = (str1==str3);  // false
		            	boolean b2=(str1.equals(str3));   // true

           		System.out.println(b1+",   "+b2);

				}
				
				
		A. true, false								B. false, false
		C. false, true	(Correct)							D. true, true				
		 
		 */
		
		 String str1 = "Java";      
      String[] str2 = {"J","a","v","a"};  
      // Array: group of variables
      	String a="J";
      	String b="a";
      	String c="v";
      	String d="a";
      
        String str3 = "J"+"a"+"v"+"a";  //Java 
    
   	boolean b1 = (str1 == str3);  // true
 	boolean b2=(str1.equals(str3));    // true

		System.out.println(b1+",   "+b2);
		
		String str4 = new String("java");
		//int num = new int(98);
		
		String name1="cat";
		String name2="cat";
		String nm1 ="c",  nm2="at";
		String name3 = "c" +"at" ;  // cat
		System.out.println(name1 == name3 );  // false
		System.out.println(name1.equals(name3));  // true
		
		System.out.println(name1 == name3 ); // 
		
		
		
		String nm5 = new String("Java");
		String nm6 = new String("Java");
		String nm7 ="Java";
		System.out.println(nm5 == nm6);  // false
		System.out.println(nm5 == nm7);  // false
		
		
		String nm8 ="Java",  nm9 ="java";
		System.out.println(nm8.equals(nm9)); //false
		System.out.println(nm8.equalsIgnoreCase(nm9));  // true
		
		
		
		/*
		 	2. What's the result?

					public static void main(String[] args) {

                                 int numbers[];    // Arrayis fixed size
                                 numbers[0] = 10;
                                numbers[1] =20;

                         	numbers=new int[4];
                              	numbers[2]=30;
                               	numbers[3]=40;
             System.out.println(Arrays.toString(numbers));
             

					}
					
		 A. [ 0,  0,  30,  40 ]								 B. [10, 20, 30, 40]
		 C. Compilation fails 	( Correct)							 D. An exception is thrown at runtime.
		 
		 
		 */
		int[] numarr;
	//	numarr[0] = 100;
		
		
		
		
		/*
		 3. What's the result?

				public static void main(String[] args) {

                                 int numbers[];
                                 numbers =new int[2];
                                 numbers[0] = 10;
                                numbers[1] =20;

                         	numbers=new int[4];
                              numbers[2]=30;
                               numbers[3]=40;
             		System.out.println(Arrays.toString(numbers));

				}
		 
		 A. Compilation fails							B. [ 10,  20,  30,  40 ]
		 C. [ 0,  0,  30,  40 ]	 (correct)						D. An exception is thrown at run time
		 
		 */
	
		int numbers[];
     numbers =new int[2];
     numbers[0] = 10;
    numbers[1] = 20;

	numbers=new int[4];  //[ 0, 0, 0, 0]
  numbers[2]=30; // [ 0, 0, 30,0]
   numbers[3]=40; // [ 0, 0, 30, 40]
System.out.println(Arrays.toString(numbers));
		
		
		
		
		/*
		 4. What's the result of the following code fragment? 

                  public static void main(String[] args) {

                                      String str="Hello World";
                                           	str.trim();
                                     int z=str.indexOf(" ");
                                System.out.println(z);

							}
							
			A. -1								B. 5  ( correct).
			C. 0								D. An exception is thrown at run time.				
		 
		 
		 */
		
		String str="Hello World";
			str=str.trim(); 
		int z=str.indexOf(" ");
		System.out.println(z);
		
		
		
		
		/*
		 	5. Which code fragment, when inserted at line n1, enables the App class to print Equal?

					public static void main(String[] args) {

                             String str1 = "Java";
                        String str2 = new String("java");
                        
                         **** Line 1 *****   {
                           System.out.println("Equal");
                        }else {
                            System.out.println("Not Equal");
                            }

                       }
                       
           A. if(str1==str2)						     		B. if(str1.equals(str2))
           C. if(str1.equalsIgnoreCase(str2)) (correct)				D. if(str1.toLowerCase() == str2.toLowerCase())
		 
		 */
		
		
		
		
		
		/*
		 6. Given: 

            public static void main(String[] args) {
                       String stuff ="TV";
                        String res="";

                     if(stuff.equals("TV")) {
                             res="Walter";
                     }else if(stuff.equals("Movie")) {
                             res="White";
                          }else {
                              res="No result";
                      }

            }

		Which code fragment can replace the if block?

	A. stuff.equals ("TV") ? res =  "Walter":stuff.equals("Movie") ? res = "White" : res = "No Result"; 

	B. res = stuff.equals ("TV") ? "Walter" else stuff.equals ("Movie")? "White" : "No Result"; 

	C. res = stuff.equals ("TV")? "Walter" : stuff.equals ("Movie")? "White" : "No Result"; ( correct)
		 
		 */
		 String stuff ="TV";
      String res= (stuff.equals("TV")) ? "Walter": (stuff.equals("Movie")) ? "White" :
     	 				"no result";

//   if(stuff.equals("TV")) {
//           res="Walter";
//   }else if(stuff.equals("Movie")) {
//           res="White";
//        }else {
//            res="No result";
//    }
		
		
		
		
		/*
		 7.   public class Spartans{

                       public static void main(String[] args) {

                                           String num1 = args[1];
                                            String num2=args[2];
                                            String num3=args[3];
                                            
                                  System.out.println("number is "+num3);

                             }

							}

			Which command-line arguments should you pass to the program to obtain 
			the following output? number is 2
			
			A. java Spartans 0 1 2 3     [0, 1,2,3]    3  
			B. java Spartans 1 2 2 3     [1,2,2,3]    3
			C. java Spartans 1 2 2 3 4   [1,2,2,3,4]   3
			D. java Spartans 1 3 2 2	   [1,3,2,2]  2    ( correct)
			
			// formula:  
			 				javac classname.java;
			 	// run: 		java classname arg[0] arg[1]...      // argument
			
			
		 */
		
		
		
		
		
		
		/*
		 8. Which of the following code fragment inserted at line 1, enables the 
		 console to prints:        red   blue  small  medium   ?

		 					public static void main(String[] args) {
                               String shirts[][] =new String[2][2];
                                    shirts[0][0]="red";
                                    shirts[0][1]="blue";
                                    shirts[1][0]="small";
                                     shirts[1][1]="medium";

                                ** Line 1 ***
                                *

                               }


					A. for(int i=1; i<2; i++) {
					       for(int j=1; j<2; j++) {
			                    System.out.println(shirts[i][j]);
			                    }
					        }
					
					B. for(int i=0; i<2; ) {
			              for(int j=0; j<2; ) {
			                    System.out.println(shirts[i][j]);
			                             j++;
			                    }
			                   i++;
		                }
					
					C. for(int i=1; i<2; i++) {
				            for(int j=1; j<i; j++) {
			                    System.out.println(shirts[i][j]);
				                    }
					        }
					
					D. none of the above
		 
		 */
	
	
		
		
		
		
		/*
		 9. public static void main(String[] args) {

                      String str ="Batch 11";
                       int  z  =  str.trim().length();
                     System.out.println( z );

                    }

				What's the result?
				
			
		A. 9									B. 7
		C. compile error						D. 8				 
		 
		 */
		
		
		
	
		
	}
	
	

}