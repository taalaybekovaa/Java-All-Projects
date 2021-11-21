package Homework7;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        /*
        Using a scanner enter the number of eggs in the box. Then ask the user, how many eggs
        are eaten at the end of the day and keep asking the same question until your number of
        eggs is equaled to 0 in the box
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of total eggs in the box:");
        int eggsTotal = scan.nextInt();
        int sum = 0;

        while (eggsTotal> 0) {
            System.out.println("How many eggs are eaten at the end of the day?");
            int eggsEaten = scan.nextInt();

            if (eggsTotal>= eggsEaten) {
                eggsTotal-= eggsEaten;
                System.out.println("There are " + eggsTotal + " eggs left");
            }
            else{
                System.out.println("Unfortunately, you don't have that many eggs, please enter a valid number");
            }

        }

    }
}





