package IfStatement;

public class DiscountTask {
    public static void main(String[] args) {
        /* if your payment is 100 or more will get %20 discount otherwise you will get %5 discount

         */
        int payment = 100;

        if (payment >= 100) {
            payment -= payment * 0.2;
            System.out.println("Your discount is 20%, which is  " + payment);
        } else {
            payment -= payment * 0.05;
            System.out.println("Your discount is 5% , which is " + payment);
        }
    }
        }




