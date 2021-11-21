package Loops;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        /* user has $100 as long as user has balance more than $0 ask user that how much money
        she wants to spend if the amount is less than balance update the balance and show it to user if the amount is more than the balance
        print " you don't have enough money in the account??? your balance is ....
         */
        double balance = 100;
        Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter how much money do you want spent");


        while (balance > 0) {
            System.out.println(" Please enter how much money do you want spent");
            double spend = scan.nextDouble();
            balance -= spend;
            spend = scan.nextDouble();


            if (spend <= balance) {
                balance -= spend;
                System.out.println("You have " + balance);
            } else {
                System.out.println("You don't have enough money in the account");
            }

        }
    }
}

       /*Scanner scanner= new Scanner(System.in);
        double balance =100;

        while (balance>0){//Once it is true you can do everything in your loop
        System.out.println("How much money do you want to spent? ");
        double spend= scanner.nextInt() ;

            if (spend<=balance){
                balance-=spend;
                System.out.println("You have"+balance);
                }else{
                System.out.println("You don't have enough money in the account"+balance);
            }

            }
        }

    }*/

