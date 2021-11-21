package Loops;

import java.awt.event.AdjustmentEvent;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /* ask user to enter an integer number find and print the number which can devided that given number*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer number ");
        int number = scan.nextInt();
        int divider= 1;

        while (divider<=number) {

            if (number%divider==0){
                System.out.println(divider);

            }divider++;


        }

    }
}


        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Please enter an integer number");
        int number= scanner.nextInt();
        int devider=1;

        while (devider<=number){
            if (number%devider==0){//If number divided by 2 and remeinder is 0
                System.out.println("The number is "+number+ "  and you can devided it by "+devider);

        }   devider++;


        }

    }
}*/