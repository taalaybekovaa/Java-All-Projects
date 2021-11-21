package Homework6;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

       /* Given a string, if a length 2 substring appears at both its
        beginning and end, print a string without the substring at the
        beginning, so "HelloHe" yields "lloHe". The substring may overlap
        with itself, so "Hi" yields "". Otherwise, print the original string
        unchanged.
                Example:
        "TestTe" --> print stTe
        "TestTi" --> print TestTi*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey!Please enter a string value :");
        String text = scanner.next().toLowerCase();
        int letters = text.length();
        if (text.substring(0, 2).equals(text.substring(text.length() - 2))) {
            System.out.println(text.substring(2, text.length() - 0));
        }else{
            System.out.println(text);
        }
    }
}

