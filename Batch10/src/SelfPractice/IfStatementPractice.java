package SelfPractice;

import java.util.Scanner;

public class IfStatementPractice {

    public static void main(String[] args) {
        /* if your payment is 100 or more will get %20 discount otherwise you will get %5 discount
Print out total discount*/

        double payment =100;

        if(payment>=100){
            payment-=payment*0.2;
            System.out.println("Your will get 20% discount and your payments is "+payment);
        }else{
            payment-=payment*0.05;
            System.out.println("You will det 5% discount and your payment is "+payment);
        }

    }
}

