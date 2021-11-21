package HomeworkCollection;

import java.lang.reflect.Array;
import java.sql.ClientInfoStatus;
import java.util.*;

public class Task5 {

    /* Create one method takes String Arraylist with duplicate values, this
method need to return array with descending order of unique
element from arrayList.
Input: [“java”,“phython”,“javascript”,“c++”,“java”,“c++”]Returns new String[]—> {“phython”,“javascript”,“java”,“c++”} */

    public static String[] uniqueInDescending(ArrayList<String> proLanguages) {
        TreeSet<String> set = new TreeSet(proLanguages);

        String[] array = new String[set.size()];

        Iterator <String> iterator = set.descendingIterator();


        for (int i = 0; i < array.length; i++) {
            array[i]= iterator.next();

        }
        return array;
    }

    public static void main(String[] args) {

       ArrayList<String> ln=new ArrayList<>();

       ln.add("java");
       ln.add("phython");
       ln.add("javascript");
       ln.add("c++");
       ln.add("java");
       ln.add("c++");
        System.out.println(Arrays.toString(uniqueInDescending(ln)));
    }
}

