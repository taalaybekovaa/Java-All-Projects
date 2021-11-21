package SelfPractice;

public class LoopPractice1 {

    public static void main(String[] args) {

        //Write a program to calculate the sum of first 10 natural number.



        int sum=0;//bucket-starting point

        for (int number=1; number<=10; number++){

            sum=number+sum;

        }
        System.out.println(sum);
    }
}
