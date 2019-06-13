package QUIZZES;

import java.util.Arrays;

public class OCAQuize04 {
	
	public static void main(String[] args) {
		/*
		 1. What's the result of the following code fragment?         

            public static void main(String[] args) {

                                  int[] intArr = {15, 30, 45, 60, 75};
                                       intArr[2] = intArr[4];
                                       intArr[4] =90;
                               System.out.println(Arrays.toString(intArr));

                       }
                  
          A. [ 15, 30, 45, 60, 90 ]                    		     B. [ 15, 60, 45, 90, 75 ]
          C. [ 15, 30, 75, 60, 90 ]	(Correct)							 D. [ 15, 30, 90, 60, 90 ]
          E. [ 15, 4, 45, 60, 90 ]
                       
		 */
		
		 int[] intArr = {15, 30, 45, 60, 75};
		 	//			0    1   2    3   4
         intArr[2] = intArr[4];  // [15, 30, 75, 60, 75]
         intArr[4] =90; // [15, 30, 75, 60, 90]
         
 System.out.println(Arrays.toString(intArr));
		
		
		
		/*
		 2. Given :

             public static void main(String[] args) {
                            long z= 10 ;
                          switch(z) {

                              case 10: System.out.println("Monday");
                              case 11: System.out.println("Tuesday");
                               case 12: System.out.println("Wednesday");

                                  default :System.out.println("Friday"); 
                                      } 
                             }
                              switch doesnt accept: long,double, boolean, float 

				What's the result?
				
			A. Friday									B. Monday  Tuesday  Friday
			C. Monday									D. Compile Error	 ( Correct).
		 
		 */
// long z= 10 ;
// switch(z) {
//
//     case 10: System.out.println("Monday");
//     case 11: System.out.println("Tuesday");
//      case 12: System.out.println("Wednesday");
//
//         default :System.out.println("Friday"); 
//             } 
		
		
		/*
		 3. Given :

                 public static void main(String[] args) {
                                double z= 10 ;
                              switch(z) {

                                  case 10: System.out.println("Monday");
                                  case 11: System.out.println("Tuesday");
                                   case 12: System.out.println("Wednesday");

                                      default :System.out.println("Friday"); 
                                          } 
                                 }

					What's the result?
					
			A. Friday									B. Monday  Tuesday  Friday
			C. Compile error	(correct)						D. Monday	 		
		 
		 */
		
// double z= 10 ;
// switch(z) {
//
//     case 10: System.out.println("Monday");
//     case 11: System.out.println("Tuesday");
//      case 12: System.out.println("Wednesday");
//
//         default :System.out.println("Friday"); 
//             } 
		
		
		
		/*
		 4. Given :

                 public static void main(String[] args) {
                                float z= 10 ;
                              switch(z) {

                                  case 10: System.out.println("Monday");
                                  case 11: System.out.println("Tuesday");
                                   case 12: System.out.println("Wednesday");

                                      default :System.out.println("Friday"); 
                                          } 
                                 }

				What's the result?
				
		 A. Friday									B. Monday  Tuesday  Friday
		 C. Compile error	(Compile error)						D. Monday	 		
		 
		 
		 */
		
		
		
		
		
		
		
		
		/*
		 5. Given :

             public static void main(String[] args) {
                          boolean B = true ;
                          switch( B ) {

                              case true : System.out.println("Monday");
                              case false : System.out.println("Tuesday");          

                              default :System.out.println("Wednesday"); 
                                      } 
                             }

			What's the result?
			
			A. Monday Tuesday									B. Compile Error  ( Correct)
		 	C. Monday											D. Wednesday
		 	
		 
		 */
		
		
		
		
		
		/*
		 6.  Given :

                 public static void main(String[] args) {
                                int z= 10 ;
                              switch(z) {

                                  case 10: System.out.println("Monday");
                                  
                                  case 11: System.out.println("Tuesday");

                                      default :System.out.println("Friday"); 
                                          } 
                                 }

			What's the result?
			
			A. Tuesday   Friday								B. Monday
			C. Friday										D. Compile Error
			E. Monday  Tuesday   Friday (Correct)
		 
		 
		 */
		
 int z= 10 ;
 switch(z) {

     case 10: System.out.println("Monday");
     		//	return;  // exists the method
     			//continue;
     			break;  // exits switch and loops
     
     case 11: System.out.println("Tuesday");

         default :System.out.println("Friday"); 
             } 
 System.out.println("Hello Batch 11");
		
		
		
		
		
		/*
		 7.   Given: 
				 public static void main(String[] args) {
		                    int[] arr = {10, 20, 30};
		                    int size =arr.length;
		                    int idx = 0;
		
		
		                *** Line n1 *****
		                  System.out.println( arr[idx]);
		              }

			Which code fragment, inserted at Line n1, pints  30 ?

    	A. do {                                                 B. while(idx < size) {
                idx++;                                                     idx++;
          }while(idx>=size);                                             }
 

		C.   do {                                                D. while( idx <= size){
           idx++;                                                            ++idx;
          } while( idx < size -1);  ( Correct)                                        }
		 
		 
		 */
		
			 int[] arr = {10, 20, 30};
			 //				0, 1,  2
			 int size =arr.length;  // 3
			 int idx = 0;
			
			
			// line 1
//			 do {  
//				 idx++;  // 1
//			  }while(idx>=size);
			 
//			 while(idx < size) {
//				 idx++; //1+1+1=3
//			 }
			 
			 do {
				 idx++; //1+1=2
			 } while( idx < size -1);
			 
			 
//			 while( idx <= size){
//				 idx++; // 1+1+1+1=4
//			 }
			System.out.println( arr[idx]);
		
		
		/*
		 8. What's the result of the following code fragment? 

                  public static void main(String[] args) {
                             int num1=9;
                            if(num1++ < 10) {
                                    System.out.println(num1 + " Hello World!");
                             } else {
                                    System.out.println(num1 + " Hello Universe!");
                               }
                          }
		 
		   A. 9 Hello World!							     B. Compilation fails.
		   C. 10 Hello Universe!							 D. 10 Hello World! (Correct)
		 
		 
		 */
		
			  int num1=9;
			  
              if(++num1 < 10) {
                      System.out.println(num1 + " Hello World!");
               } else {
                      System.out.println(num1 + " Hello Universe!");
                 }
		
		
		
		
		/*
		 9. What's the result of the following code fragment? 

                  public static void main(String[] args) {
                             int num1=9;
                            if(++num1 < 10) {
                                    System.out.println(num1 + " Hello World!");
                             } else {
                                    System.out.println(num1 + " Hello Universe!");
                               }
                         }
                     
                  A. Compilation fails								B. 10 Hello Universe!  ( correct)
                  C. 10 Hello World!								D. 9 Hello Universe!
                  
		 */
		
		
		
		
		
		/*
		 10. public static void main(String[] args) {

							***** line n1 *******
							switch ( x ) {
							case 1: System.out.println("One");
							break;
							case 2: System.out.println("Two");
							break;
							  }
							  
					}

				Which three code fragments can be independently inserted at line n1 to 
				enable the code to print  one?

				A. byte x = 1; (correct)                                   B. short x = 1; (Correct)

 				C. String x = "1";                              D. long x = 1;

				E. double x = 1;                                  F. int x = 1; ( Correct).
				
				ABF
				
		 */
             char x=9;
             
              switch ( x ) {
				case 1: System.out.println("One");
				break;
				case 2: System.out.println("Two");
				break;
				
				default: System.out.println("Invalid");
				  }	
		
		
		
	}

}