package IfStatement;

public class Practice1 {

    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 10;

        if (a == b) {
            System.out.println("You can go to picnic");

        }
        if (a == c) {

            System.out.println("This is second option for picnic");
            System.out.println("This is second option for picnic");
            System.out.println("This is second option for picnic");

        }
        if (a == b || a != c) {

            System.out.println("Yaaay, I am going");
        }

        System.out.println("I will be happy");

    }
}
      /*As I understood in this tasks If-is a different conditions if condition in parentheses is true
        it is going to show you next line and continiue to check others condition, if not it's going to skip you to the second condition and check again if is true or not.
        If condition is false it's not going to show you the code and will skip it to the next condition

        If second condition is true you will see the next line again and the previous condition as well/ than this condition going to check next condition and if thre is a parenthesis it is going to show you only that result where condition is true
        If there is no curly braces and condition is false it's going to skip the line after condition and will show only the second line
        If condition is true it's going to show you both answers
        We are comparing again IF IF IF
       */



