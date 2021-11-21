package Homework7;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        /*Using scanner ask user to provide the string value. Print "dad" if the given string contains the "dad", but where the middle 'a' char can be any char.
        Example:
        Input the year: testdadtest
        Output :dad
        Input the year: testd7dtest
        Output :dad
        Input the year: testdodtest
        Output :dad
        Input the year: testDudtest
        Output :dad*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Hi.Please enter a string");
        String word = scan.nextLine().toLowerCase();

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'd' && word.charAt(i + 2) == 'd') {

                System.out.println("dad");

            }
        }
    }
}