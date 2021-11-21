package Loops;

public class ForLoop1 {
    public static void main(String[] args) {
        //local variable
        for (int number = 1; number <= 5; number++) {// we can create starting point inside of()// it is going to run 6 times, bc 0 is also counting

            System.out.println("It is for LOOP" + number);// If you didi not put anything it's going to run anyway if put number+ it's going to count
            //code
        }
        int number = 1; //YOu
        for (; number < 5; number++) {// we can create starting point inside of()// it is going to run 6 times, bc 0 is also counting

            System.out.println("It is second LOOP" + number);
        }
        for (; number <10; ) {// you can create variable before and after// condition must be in the middle and in ()
            number++;
            System.out.println("It is third LOOP" + number);
        }

    }
}