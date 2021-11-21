package Homework2;

public class Bonus {

    public static void main(String[] args) {

        int salary=200_000;

        double firstBonus=(salary*0.5)*0.05;
        System.out.println("Amount of first bonus is " +firstBonus);

        double b2=(salary*0.3)*0.08;
        System.out.println("Amount of second bonus is "+ b2);

        double b3=(salary*0.2)*0.10;
        System.out.println("Amount of last bonus is "+b3);

        double totalBonus= firstBonus+b2+b3;
        System.out.println(totalBonus+" is a total bonus.");


    }
}
