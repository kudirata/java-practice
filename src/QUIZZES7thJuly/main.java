package QUIZZES7thJuly;

import java.util.Scanner;

class main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("# in:");
    int amt = inp.nextInt();
    inp.nextLine(); //this line is necessary
    System.out.print("word:");
    String word = inp.nextLine();
    //leave the above unedited, write your code below:
    
    System.out.println();
    System.out.print(amt + " " + word+"s");
    System.out.println();
    
  }
}