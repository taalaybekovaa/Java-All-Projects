package Homework12;

import java.util.Scanner;

public class TimeTest {
           /* Create one TimeTest class with the main method.Display one a
            welcome message for the user.
            Declare 3 obje. (Dects for one for time, one for a date, and one for
            data and timo not initialize them in the beginning)
            Create the implementation when we click the 9 it will stop
            running and will print the instructions first from Time Class.
            Call the related method according to instructions. For example
            when the user clicks the 1 needs to create the Time. We can call
            a related constructor from the Time class to create the time and
            for the constructor arguments, we need to ask the information
            to the user using the scanner.*/

    public static void main(String[] args) {
        System.out.println("Hi, user. Welcome to our app!");

        Time time= new Time();
        Time date= new Time();
        Time dataTime= new Time();

        System.out.println("Enter what you want to do: ");
        time.instruction();

        Scanner scan = new Scanner(System.in);
        int usersInput = scan.nextInt();

        switch (usersInput) {
            case 1:
             time.getTime(scan.nextInt());
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                System.out.println("press 5 to update data");
                break;
            case 6:
                System.out.println("press 6 to print Time information");
                break;
            case 7:
                System.out.println("press 7 to print Date information");
                break;
            case 8:
                System.out.println("press 8 to print Data and Time information");
                break;
            case 9:
                System.out.println("press 9 to exit");
        }

        System.out.println("Thanks for shopping with us");

    }

}
