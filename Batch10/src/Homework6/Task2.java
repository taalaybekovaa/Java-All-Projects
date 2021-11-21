package Homework6;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

/*Using scanner ask user to enter any String value. If this String
        has the color like red or blue with lower case print the red or blue.
                EXAMPLE-1:
        Input: "xxredyy"
        Output: red
        EXAMPLE-2:
        Input: "xbxltue"
        Output: blue*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Hi.Please enter any String value: ");
        String word= scan.nextLine().toLowerCase();

        if (word.contains("r") && word.contains("e") && word.contains("d")){
            System.out.println("Your color is red!");
        } else if (word.contains("b") && word.contains("l") && word.contains("u") && word.contains("e")){
            System.out.println("Your color is blue!I like blue color too!");
        }else
            System.out.println("Oops! There is no matching color");
    }
        }

