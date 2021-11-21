package Mentoring;

import java.util.Scanner;

public class PlayingWithLettersPractice {

    public static void main(String[] args) {

        //  ask user to enter one string value with three word
//1- Print first letter of each word
//2- Print last letter of each word
// 3-Print the sum of last letter of each word's index number
// 4-Print the sum of first letter of each word's index number
//    Example: "Java String Test"
//    Output:
//    JST
//    agt
        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter three words");
        String words= input.nextLine();

        String firstLetter="";// bucket for first word
        String lastLetter=""; // bucket for last word
        firstLetter+=words.charAt(0);// putting in this bucket first letter of the words, which is obviously O

        for(int i=0; i<words.length();i++){//

            if(words.charAt(i) ==' '){ // if words chart = to space
                firstLetter+=words.charAt(i+1);//put in a bucket from space to the next letter
               lastLetter+=words.charAt(i-1);

            }
        }
                lastLetter+=words.charAt(words.length()-1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);
        }
    }
