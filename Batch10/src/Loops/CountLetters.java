package Loops;

import java.util.Locale;

public class CountLetters {

    public static void main(String[] args) {
      // "I want to solve this question by myself"
        //count how many 'i' and 'I' are in the given sentence
        String text="I want to solve this question by myself";
       // text=text.toUpperCase().replace("I", "");You can replace like that
        text=text.toUpperCase();
        int index=0;
        int count=0;

        while (index <text.length()) {

            if (text.charAt(index)=='i' || text.charAt(index)=='I'){
                count++;

            }
         index++;
        }
        System.out.println("There are "+count +"'i' in the sentence");


    }
}
