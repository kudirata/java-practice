package day23_LoopControl;

import java.util.Scanner;

public class ConcatWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);
        
        String word="";
        String allWords="";
        
        for (int i = 0;i<6;i++) {
        	
            System.out.println("Type the word");
            
            word = scan.next();
            
            if(word.contentEquals("java")) {
            	
                continue;
                
            }
            allWords += word + ", ";
        }
System.out.println("All words: "+allWords);
			
		}
		
		

	}


