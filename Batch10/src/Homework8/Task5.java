package Homework8;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        /* Write a program in Java to display any number in reverse order.
        Test Data :
        Input a number: 12345 (it can be any number like 5 digits or 6 digits etc.)
        Expected Output :
        The number in reverse order is: 54321  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any int number : ");
        int number = scan.nextInt();
        int reverse = 0;

        for (; number != 0; number = number / 10) {// when condition become false, it's going to show me the reverse number
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;

        }
        System.out.println(" The reverse number of " + number + " is: " + reverse);
    }
}
