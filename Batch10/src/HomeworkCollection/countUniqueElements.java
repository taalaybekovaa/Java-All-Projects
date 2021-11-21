package HomeworkCollection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class countUniqueElements {

/* Create one method takes one String array. This method needs to return
how many unique element you have in array.
Input: [“java”,“phython”,“javascript”,“c++”,“java”,“c++”]
Output: 4
 */


    public static Integer counterUnique(String [] array) {
   HashSet <String> set= new HashSet<>();
   for(String counter: array) {
       set.add(counter);
   }
   return set.size();
   }


    public static void main(String[] args) {

        String [] array= {"jhgfhjdf" , "bmx", "bmx"};
        System.out.println(counterUnique(array));
    }
    }
