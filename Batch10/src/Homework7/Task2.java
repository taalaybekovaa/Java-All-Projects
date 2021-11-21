package Homework7;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

       /*Using a scanner ask the user to provide starting and ending numbers. Print the numbers
    divisible by 3 and 5 between given number AND print count of those numbers which is
    divisible by 3 and 5.
    EXAMPLE:
    First number: 5
    Second number: 65
    Output:
            15
            30
            45
            60
    Total number that divisible by 3 and 5 is 4.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a starting number");
        int number = scan.nextInt();
        System.out.println("Please enter an ending number");
        int number2 = scan.nextInt();
        System.out.println("Your numbers is divisible by: ");
        int count = 0;
        int a = number;

        while (a <= number2) {
            if (a % 5 == 0 && a % 3 == 0) {
                System.out.println(a);
                count++;
            }
            a++;
        }
        System.out.println("There are "+count +" total numbers divisible by 3 and 5.");
    }
}