package Homework9;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {

        /*Create the following array size of 7 and store the following number {1, 1, 2, 2, 3, 4, 4 }.
Print only the first unique value from this array.Output:3.NOTE: Test your code with different array values. */

        int[] numbers = {1, 1, 2, 2, 3, 4, 4};
        int[] uniqueNum = new int[7];
        int i = 0, j = 0, count = 0;
        boolean status;
        while (i < numbers.length) {
            status = true;
            while (j < numbers.length) {
                if (numbers[i] == numbers[j] && i != j) {
                    status = false;
                }
                j++;
            }
            j = 0;
            if (status) {
                uniqueNum[count] = numbers[i];
                count++;
            }
            i++;
        }
        System.out.println(Arrays.toString(uniqueNum));
        System.out.println("Unique number is "+uniqueNum[0]);
    }
}
