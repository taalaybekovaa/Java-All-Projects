package Project3;

public class Task2 {

    public static void main(String[] args) {


                double quarters = 25;
                double dimes = 10;
                double nickels = 0.5;
                double pennies = 0.1;

        System.out.println();

                double qt = quarters * 5;
                double dt = dimes * 4;
                double nt = nickels * 3;
                double tp = pennies * 2;

                double total = qt+dt+nt+tp;

                System.out.print("The total in dollars is $");
                System.out.printf("%.2f",total);




                System.out.println();



    }
}
