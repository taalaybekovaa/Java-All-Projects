package IfStatement;

public class Practice2 {

    public static void main(String[] args) {

        int age = 12;
        double money = 200;

        if (age >= 18) {

            System.out.println("You can go to picnic");//It will skip this block because of the age -false
        }
        if (money >= 100) {

            System.out.println("You can go to picnic with this amount: " + money);
        }
//combine these two condition to create an if statement
// which will accept either of conditions age or more
        //print out "You are okay with one of the requirement


        if (age >= 18 || money >= 100) {
            System.out.println("You are okay with one of the requirement");

        }
    }
}