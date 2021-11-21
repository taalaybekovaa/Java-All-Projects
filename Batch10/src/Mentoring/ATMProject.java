package Mentoring;

import java.util.Scanner;

public class ATMProject {
    /*I am doing to create a card number and password */
    public static void main(String[] args) {


    String savedCardNumber = "123-456-789";
    String savedPassword = "altynai123";
        int chances=3;
        int choice;
    Scanner scan = new Scanner(System.in);

        //it s going to happen all the time until you are inside of the account
        do { System.out.println("Please input your card number : ");
            String cardNumber= scan.nextLine();
            System.out.println("Please enter your password");
            String password=scan.nextLine();


            if(cardNumber.equals(savedCardNumber)&& password.equals(savedPassword)){// if password and card# is true, than you are inside
                System.out.println("Welcome to the Bank of America ATM");
                System.out.println(" What would you like to do today?");
                System.out.println("1-Withdraw\n2-Deposit\n3-Balance\n4-Payments\n5-Change the password\n6-Exit");

                break; //otherwise it's going to show the question again
            }else{
                chances--; // lower the chances
                System.out.println("Invalid number card or password. Please try again.You have "+chances+" left");
                if(chances==0){
                    System.out.println("Your card is hold by the ATM machine. Please contact Customer Service ");
                    break;
                }
            }

        }while(true);


}

}
