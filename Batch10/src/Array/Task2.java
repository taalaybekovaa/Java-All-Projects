package Array;

import java.sql.Array;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        /* Using loop print out only numbers they are greater than 10.Create an array to store these numbers: 45, 5, 6, 47, 57, 8, 12, 0, 30
        Store numbers if they are less than 10 in another array.Find the biggest number from this array*/

        int[] numbers = {45, 5, 6, 47, 57, 8, 12, 0, 30};
        int smallNumbers[]= new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                System.out.println(numbers[i]);
            }else{
                smallNumbers[i]=numbers[i];
            } System.out.println(Arrays.toString(smallNumbers));

        }
    }
}