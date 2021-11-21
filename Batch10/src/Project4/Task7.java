package Project4;

import java.lang.module.FindException;
import java.util.Locale;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any two words with spaces in the beginning and at the end");
        String words = scanner.nextLine().trim();
     String word1=words.substring(0,words.indexOf(" "));
        System.out.println(word1);
        String word2=words.substring(words.indexOf(" ")).trim();
        System.out.println(word2);
        String blackUpper=word2.toUpperCase();
        System.out.println(blackUpper);
        String b=blackUpper.substring(0,1);
        System.out.println(b);
        String lack=blackUpper.substring(1,5);
        System.out.println(lack);
        System.out.println(b+lack);







    }
}