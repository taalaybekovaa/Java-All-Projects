package Homework8;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a starting number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter an ending number: ");
        int secondNumber = scan.nextInt();
        System.out.println("The prime numbers between 1 and 50 are :");
        boolean prime;

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i == 1 || i == 0)
                continue;
            prime = true;

            for (int divider = 2; divider<= i/2 ; ++divider) {
                if (i % divider == 0) {
                    prime = false;//to do if statement is not true anymore
                    break;
                }
            }
            if (prime)
                System.out.print(i+ "  ");
        }
    }
}