package Switch;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        /*solve the problem using switch ask user to provide a number between 1 to 7
        print the matching name of the day for that number
        when users enters 1--> it is a monday */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter number from 1 to 7");
        int number= scan.nextInt();
        switch(number) {
            case 1:
                System.out.println("You entered "+ number+" it is a Monday");
                break;
            case 2:
                System.out.println("You entered " + number+ " it is a Tuesday");
                break;
            case 3:
                System.out.println("You entered " + number+" it is a Wednesday");
                break;
            case 4:
                System.out.println("You entered "+ number+" it is a Thursday");
                break;
            case 5:
                System.out.println("You entered "+ number+ " it is a Friday");
                break;
            case 6:
                System.out.println("You enetered "+number+ " it is a Saturday");
                break;
            case 7:
                System.out.println(" You entered "+ number+ " it is a Sunday");
                break;
            default:
                System.out.println(" You entered invalid number ");


        }
    }
    }
        /*solve the problem using switch ask user to provide a number betrween 1 to 7
        print the matching name of the day for trhat number
        when users enters 1--> it is a monday

         */
       /* Scanner input=new Scanner(System.in);
        System.out.println(" Please enter a number between 1 to 7 ");
        int number= input.nextInt();

        switch(number){
            case 1://You cannot have the same cases more than once
                System.out.println("It is a monday");
                break;
            case 2:
                System.out.println("It is a tuesday");
                break;
            case 3:
                System.out.println("It is a wednesday");
                break;
            case 4 :
                System.out.println("It is a Thursday");
                break;
            case 5:
                System.out.println("It is a Friday");
                break;
            case 6 :
                System.out.println("It is a Sunday");
                break;
            case 7:
                System.out.println("It is a Sunday");
                break;
            default:
                System.out.println("You entered wrong number");


        }


    }
}*/