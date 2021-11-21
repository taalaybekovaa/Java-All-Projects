package Mentoring;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
    // Binary Search
        /*Binary search will returm ==n index number, if the element is present in the array
        //if the element is not in the array, it will return posiible element position with negative sign
        you need to sort the array before you apply binary search
         */


    int [] studentNumber={100,10,15, 20, 30, 35};
    // As it sorted by order  that's way it's counting not by index by elements a nd starting from 1

        Arrays.sort(studentNumber);
        System.out.println(Arrays.toString(studentNumber));
        System.out.println(Arrays.binarySearch(studentNumber,35));//binary should be after you sorted
        //String string="Java";
        //System.out.println(string.indexOf("a"));//index number of first a--> 1
        System.out.println(Arrays.binarySearch(studentNumber,25));//


    }
}
