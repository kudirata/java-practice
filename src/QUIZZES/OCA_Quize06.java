package QUIZZES;

import java.util.ArrayList;

public class OCA_Quize06 {
	
final public static void main(String[] args) {
		
		/*
		 1.	  Which two code fragments can be independently inserted at line n1 
		 	to enable the code to print the elements of the array in reverse order?
		 
					  public static void main(String[] args) {
			                 int arr[] = {10, 20, 30, 40, 50};
			                 int x= array.length;
			                     Line n1 
			                }
 
			A. while( x > 0 ){          ( Correct )                      
						x--;                            		
				System.out.print( arr[x] +" " ) ;            
			}                                               
		
			
			 B. do { 
					x--;
				System.out.print( arr[x]+" " )  ;
				} while ( x >= 0);	
				

			C. while(x >= 0 ){                             	
				System.out.print( arr[x]+" " );               	
					x--;                                              
				}                                               
			
			
			D. do {
					System.out.print( arr[x]+" " );	
						x--;
					}while( x >=0 );
					

			E. while ( x > 0 ) {                        ( Correct )      
				System.out.print( arr[--x]+" " );                  		
				}                                             	
		 
		 
		 	F.  while ( x > 0 ) {
		 				System.out.print( arr[x--] +" " );
		 				}
		 */
		
		
	int array[] = {10, 20, 30, 40, 50};
	int x= array.length; 
	// for( initilization, condition, iterator)
	for(int i=x-1; i >= 0; i--) {
		System.out.print(array[i] +" ");    // 50  40  30 20  10
	}
         
		System.out.println();
	int z=x-1;
	// while(condition)
	while(z >= 0) {
		System.out.print(array[z] +" ");
		z--;
	}
	
	System.out.println();
	
//	 while( x > 0 ){                              
//			x--;   // 4-1=3-1=2-1 =1 -1=0                      		
//	System.out.print( array[x] +" " ) ;  // 50,    40,   30,  20 , 10  
//	 	}         
	
	 
//	 do { 
//			x--; // 4-1=3-1=2-1=1-1=0-1= -1 
//		System.out.print( array[x]+" " )  ;  // 50, 40, 30, 20, 10,  -1
//		} while ( x >= 0);	
//              // 0 >= 0 
		
		
//	 while(x >= 0 ){          // 5, 4, 3, 2, 1, 0                   	
//			System.out.print( array[x]+" " );               	
//				x--;                                              
//			}     
	
	
	
//	do {
//		System.out.print( array[x]+" " );	
//			x--;
//		}while( x >=0 );
	
	
//	while ( x > 0 ) {                             
//		System.out.print( array[--x]+" " );  // 50, 40, 30, 20, 10
//								// x: 4  3  2  1  0
//		}  
	
//	while ( x > 0 ) {                             
//		System.out.print( array[x--]+" " );  
//								
//		}  
	
	
		/*
		2.	What's the result?
		
				public class cccc {

                   		public static void main(int[] args) {
                             System.out.println("int main");     

                        }


                      	public static void main(String[] args) {    
                              System.out.println("String main");

                        }

                       	public static void main(double[] args) {
                                  System.out.println("double main");

                           }

                 		public static void main(char[] args) {
                                System.out.println("char main");
                                
                           }
            		}
            		
            		
            		
            		result:  String main
		 */
		
		
		
		
		
		/*
		3.	Which code fragment causes a compilation error?

			A. float  flt = 100f;				B. float  flt  = 100; 

			C. double  y1 =  200;						D. int  y2  =  100;
				float  flt =  y1; ( correct)					float  flt =  y2;
                 
                                   double > float > long > int > short > byte
		 */
		
	double  y1 =  200;
	float  flt = (float) y1; 
	
	
		
		
		/*
		 4.	Which of one of the following will give compile error?

				A. ArrayList<String> list=new ArrayList<String>();
				B. ArrayList<String> list=new ArrayList<>();
				C. ArrayList<> list=new ArrayList<String>(); ( correct)
				D. List<String> list=new ArrayList<>();
		 
		 */
	
//	int o = new int(10);
	int[] arr1 = new int[8];
	
	 ArrayList<int[]> list=new ArrayList<>();
	 			
		
		
		/*
		 5.	Which of one of the following does not give any compile error?

                 public static void main(String[] args) {
                 
                               ArrayList<int> list=new ArrayList<>();
                                         list.add(10);
                               System.out.println(list);
                               
                       }
                       
           A.	[ 10 ]									B.	[ 0 ]
           C.	Compile Error							D.	[ ]	 
		 
		 */
		
		
		
		
		
		/*
		 6.	What's the result? 

                 public static void main(String[] args) { 
                        ArrayList<Integer> list1=new ArrayList<>();
                                 list1.add(1);
                                 list1.add(2);
                                 list1.add(3);

                         			int a=1;
                               list1.remove(a);

                              System.out.println(list1); 

                         }
		 
		 	A.	[ 1, 3 ]									B.	[ 2 , 3 ]
		 	C.	Compile Error								D.	[ 0, 1, 3 ] 		 
		 
		 */
		
		
		
		
		
		
		/*
		 7.	What's the result? 

                 public static void main(String[] args) { 
                            ArrayList<Integer> list1=new ArrayList<>();
                                     list1.add(1);
                                     list1.add(2);
                                     list1.add(3);

                                     Integer a=1;
                               		list1.remove(a);

                              System.out.println(list1); 

                      }
				
			A.	Compile Error									B.	[ 3 ]
			C.	[ 1, 3 ]										D.	[ 2, 3 ]
		 
		 */
		
		
		
		/*
		 8.	What's the result? 

                 public static void main(String[] args) { 

                             int x= 7;
                		if(available(x)) {                // Line 1
                           System.out.println("Java SE");
                       }else {
                           System.out.println("Java EE");
                        } 

                  }
                  
              public static boolean available(int x) {
                         return x > 1 ? true : false;
                     }
                     
             A.	Java SE											B.	Java EE
             C.	Compilation fails at line n1.					D.	Exception is thrown at run time
 
		 
		 */
		
		
		
		
		
		/*
		 9.	What's the result?
		 
		  public static void main(String[] args) { 
                         int var1 = 200;
                    System.out.print( doCalc(var1) );
                    System.out.print( "      " + var1 );

                 }
                 
           static int doCalc(int var1) {
                       var1 = var1 * 2;
                      return var1;
                 } 
		 
		 A.	400   400									B.	200   200
		 C.	400   200									D.	Compilation fails	 
		 
		 */
		
		
		
		
		
		/*
		 10.	What's the result?
		 
		   public static void main(String[] args) { 
		   
                  String[][] chs = new String[2][];
	                      chs[0] = new String[2];
	                      chs[1] = new String[5];
                          	int i=97;

                  for(int a = 0; a < chs.length; a++) {
                      for(int b = 0; b < chs.length; b++) {
                               chs[a][b] =""+i; 
                                   i++;
                              }
                       }

            	for(int a = 0; a < chs.length; a++) {
                    for(int b = 0; b < chs[a].length; b++) {
                             System.out.print( chs[a][b] + " ");
                                     }
                          }

       			}
		
		A.	97  98  99  100  null  null  null						B.	97  98  99  100  101  102  103
		C.	Compilation rails										D.	Exception is thrown at run time	
		 
		 
		 */
		
		
		
		
		
	}

}
