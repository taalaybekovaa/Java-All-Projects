package Loops;

public class WhilePractice1 {

    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            System.out.println("I want to go home");
            //count=10;//Features of loop it' sgoing to go back and check the condition again
            count++;//code We need to create new condition to stop loop otherwise it's going to run fo forever

        }
    }
}