package Homework7;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
/* Using the scanner ask the user to provide String value. Then replace all the
char of the String with 'a' using loop and print in every step.
For example:
Input: Success
Output:
"auccess"
"aaccess"
“aaacess”
...
“aaaaaaa
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please provide any string value:");
        String word=scan.nextLine();

        for(int a=0; a<word.length();a++){
            word=word.replaceFirst(word.substring(a,a+1),"a");
            System.out.println(word);

        }
    }
}
