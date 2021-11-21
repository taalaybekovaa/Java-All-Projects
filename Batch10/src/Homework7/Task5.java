package Homework7;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        /*
        The user using a scanner enters the current speed and target speed .
        In every 1-sec car's speed will increase 10mil. Please find the total number of sec
        to reach your target speed using a while loop.
        Example:
        CurrentSpeed: 6
        Target Speed: 20
        Output: You need 2 sec to reach target speed. */

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter current and target speeds");
    int current = scan.nextInt();
    int target = scan.nextInt();
    int speed = current;
    int seconds = 0;

        while (speed<= target){
        speed +=10;
        seconds++;
    }
        System.out.println("You almost there! It is going to take " + seconds + " seconds.");
}
}

