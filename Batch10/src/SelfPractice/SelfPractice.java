package SelfPractice;

import java.util.Scanner;

public class SelfPractice {

    public static void main(String[] args) {

     /* Using scanner ask user to enter two String value and concatenate them
        together then print the result. If both String length is not same then omit
        chars from the longer string, so it is the same length as the shorter string.
                After making both string same length then concatenate it.
        EXAMPLE-1:
        String 1: "Cell"
        String 2: "Phone"
        Output: "CellPhon"
        EXAMPLE-2:
        String 1: "Cable"
        String 2: "Mic"
        Output: "CabMic"*/
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a string value: ");
        String word1= scan.nextLine();
        System.out.println("Please enter a second value: ");
        String word2= scan.nextLine();

        String question=word1.length()<word2.length() ? word1:word2;
      if(question.equalsIgnoreCase(word1)) {
            int lengthWord1 = word1.length();
            String cut =word2.substring(0,lengthWord1 );
            System.out.println(word1.concat(cut));
        }else{
          int lengthWord2 = word2.length();
          String cut2=word1.substring(0,lengthWord2);
          System.out.println(cut2.concat(word2));
      }
}
}
