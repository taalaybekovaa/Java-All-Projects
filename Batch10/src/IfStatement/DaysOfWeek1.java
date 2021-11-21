package IfStatement;

import java.util.Scanner;

public class DaysOfWeek1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first letter of the day");
       String text=input.nextLine();

        if (text.equalsIgnoreCase("M")){
            System.out.println("It is Monday");
        }
        if (text.equalsIgnoreCase("T")){
            System.out.println("It is Tuesdya or Thursday");
        }
        if (text.equalsIgnoreCase("W")){
            System.out.println("It is Wednesday");
        }
        if (text.equalsIgnoreCase("F")){
            System.out.println("It is Friday");
        }
        if (text.equalsIgnoreCase("S")) {
            System.out.println("It is Sunday or Saturday");

        }else
                System.out.println("Your entry is not valid, there is no day starting with that chart");

            }
        }



