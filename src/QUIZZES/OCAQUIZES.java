package QUIZZES;


import java.util.ArrayList;
import java.util.Arrays;
public class OCAQUIZES {
	
    public static void main(String[] args) {
    
            method( 'L'  );
        //  byte < short < int < long < float < double;
            
            
            ArrayList<Integer> list=new ArrayList<>();
                    list.add(1);  //0
                    list.add(2);//1
                    list.add(3);//2
                    Integer a=1;
                    list.remove(1);  // primitive: it removes the index number
                    list.remove(a);  // wrapper: removes that specific value
                    System.out.println(list);
                    
                boolean b1= list.remove(new Integer(3)) ;
                // wrapper class: returns boolean expression in remove method
            
                
                
                ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
                Integer y=7;
                //int y=9;                          //         0 1 2 3 4
                if( list1.remove(y) ) {                 //[1,3,4,5]
                    list1.remove(2);
                }
                System.out.println(list1);
            
    }
    public static void method( byte a) {
        System.out.println("byte version");
    }
    
    public static void method(int a) {  //  a='L'
        System.out.println("int version");
    }
    
    public static void method( Character a) {
        System.out.println("character version version");
    }
    
    
}