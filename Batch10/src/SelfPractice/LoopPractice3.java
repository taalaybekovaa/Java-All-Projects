package SelfPractice;

import java.util.Scanner;

public class LoopPractice3 {

    public static void main(String[] args) {

       // Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int number=scan.nextInt();
        System.out.println("Multiplication table of "+number);

        for(  int multiplication=1; multiplication<=10; multiplication++){
            int sum;
            sum=number*multiplication;
            System.out.println(number+"*"+multiplication+"="+sum);

        }
    }
}
