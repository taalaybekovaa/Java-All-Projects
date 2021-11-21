package Scanner;

import java.util.Scanner;

public class PracticeTask1 {
    public static void main(String[] args) {

    /*David wants to deposit his money into his bank account
    he already got $200 in his account
    he got three different paychecks ($480, $600 and $350)
    he can only deposit one paycheck at a time
    after he got his all money in the account
    he bought a phone for $599 and headphone for $299
    calculate his final money in his account

    */
        Scanner scanner =new Scanner(System.in);
        double balance=200;
        System.out.println("Please enter amount of your deposit");
        double firstDeposit=scanner.nextDouble();

        balance+=firstDeposit;
        System.out.println("Your first balance is "+balance);
        System.out.println("Please enter your second deposit");
        double secondDeposit=scanner.nextDouble();
        balance+=secondDeposit;
        System.out.println("Your current balance is ");

        System.out.println("Please enter your third deposit");
        double thirdDeposit= scanner.nextDouble();
        balance+=thirdDeposit;
        System.out.println("Your current balance is "+balance);
        System.out.println("What is the phones price");
        double phonePrice= scanner.nextDouble();
        balance-=phonePrice;
        System.out.println("Your current balance is "+balance);
        System.out.println("What is the headphone price?");
        double headphone$= scanner.nextDouble();
        balance=headphone$;
        System.out.println("Your current balance is "+balance);





}
}

