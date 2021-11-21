package HomeworkCollection;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class DescendingOrder {

    /* Create one method takes one int array. This methods needs to print all
    unique element from array in descending order.
            Input: [2,3,4,4,7,2,1]
    Output: 7, 4, 3, 2, 1*/

    public static void descendingElement(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : array) {// to put all array to the set
            set.add(num);
        }
        for (int i: set.descendingSet())// we are assigning returning type as an int: set.reverse
        System.out.print(i+",");

    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 4, 7, 2, 1};
        descendingElement(array);
    }
}