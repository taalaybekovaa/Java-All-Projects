package Homework6;

import java.util.Scanner;

public class Task3 {

    public static void main (String[] args) {

        /*Given a string, if one or both of the first 2 chars is 'x', print the string without those 'x' chars, and otherwise print the string
        unchanged.
       "xHi" → "Hi"
       "Hxi" → "Hi"
       "Tesxt" → "Testxt"*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi.Please enter a string value: ");
        String word = scanner.nextLine().toLowerCase();
        int length = word.length();

        if(word.startsWith("xx")){
            System.out.println(word.substring(2,word.length()-0));

        }else if(word.startsWith("x")) {
            System.out.println(word.substring(1,word.length()-0));

        }else if(word.charAt(1)=='x') {
            String firstLetter = word.substring(0, 1);
            String word2 =word.substring(2,word.length()-0);
            System.out.println(firstLetter.concat(word2));
        }else{
            System.out.println(word);
        }
        }
    }
