package Homework9;

import java.util.Arrays;

public class Task10d2 {

        public static void main(String[] args) {

/*Create the following array size of 13 and store the following number
{ 4, 4, 5, 12, 6, 7,12 7,1, 1, 2, 2, 3 }
Print all unique values from UNSORTED array.
Output:
3 5 6
 */
            int[] array = {4, 4, 5, 12, 6, 7, 12, 7, 1, 1, 2, 2, 3};
            System.out.println(Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                int j;
                for ( j = 0; j < array.length; j++) {
                    if (i != j && array[i] == array[j]) {
                        break;
                    }
                }
                if (j == array.length) {
                    System.out.print(array[i]+" ");
                }
            }
        }
    }

