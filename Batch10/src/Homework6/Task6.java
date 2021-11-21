package Homework6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        /*Write a program in Java to check whether a String is a palindrome
        or not.
        Input a number: Civic
        Expected Output :
        Civic is palindrome. NOTE: A string is said to be a palindrome if the string read from left to right
        is equal to the string read from right to left. For example, ignoring the difference between uppercase and lowercase letters,
        the string "iTopiNonAvevanoNipoti" is a palindrome */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string word :");
        String word= scan.nextLine(),reverse ="";

        for(int i=word.length()-1;i>=0;i-- ){
            /*Starting point begins from the end, bc in this task we need to reverse word.
            At this point i>=0 is a condition which means stop, when you get to the end of the word from reverse
             */
            reverse+=word.charAt(i);
        }
        System.out.println(" reverse:"+reverse);
        if(word.equalsIgnoreCase(reverse)){
            System.out.println("Your word is a palindrome word");
        }else{
            System.out.println("Your word is not palindrome word");
        }

    }
}
