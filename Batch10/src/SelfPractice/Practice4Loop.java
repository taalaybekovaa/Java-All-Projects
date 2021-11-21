package SelfPractice;

import java.util.Scanner;

public class Practice4Loop {

     /* user has $100 as long as user has balance more than $0 ask user that how much money
        she wants to spend if the amount is less than balance update the balance and show it to user if the amount is more than the balance
        print " you don't have enough money in the account??? your balance is ....
         */

    public static void main(String[] args) {
        double balance=100;
        Scanner scan=new Scanner(System.in);
        System.out.println("How much money do you want spend?");
        double spend= scan.nextDouble();
        balance-=spend;

        while (balance>0){
            System.out.println("Your balance is "+balance+" How much money do you want spend?");
            spend= scan.nextDouble();
            balance-=spend;

        }if (spend>balance){
            System.out.println("Your balance is "+balance+" You don't have enough money ");
        }
    }
}
