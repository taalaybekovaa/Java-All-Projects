package Mentoring.IntervievQuestions;

import java.util.Scanner;

public class RiverseStringOfNumbersPractice {

    //Ask user to input some words and sout the reverse of the words.

    public static void main(String[] args) {
        System.out.println("Please enter your words: ");
        Scanner input= new Scanner(System.in);
        String words= input.nextLine();
        String reverse="";

        for (int i=words.length()-1;i>=0;i--){// I am taking all indexes starting from the end of the word-1,
            // and while words length grater and = 0, continue iteration.Breaker is i--
        // I took all indexes and I need to show letters and print from reverse.How?
            reverse+=words.charAt(i);//I am taking the
            // empty Riverse bucket then I'm taking the words letters using charAt and (i) from for loop and putting inside this bucket
}
        System.out.println(reverse);
    }

        }



