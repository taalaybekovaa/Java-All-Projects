package HomeworkCollection;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ascendingOrder {

    /*Create one method takes one String Array and needs to return
ArrayList with unique elements with ascending from String Array.
Input: [“java”,“phython”,“javascript”,“c++”,“java”,“c++”]
Returns new ArrayList —> [“c++”,“java”,“javascript”,“phython”] */


    public static ArrayList ascending(String[] array) {
        Set set = new TreeSet();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        ArrayList<TreeSet> list = new ArrayList<>();
        list.addAll(set);

        return list;

    }

    public static void main(String[] args) {

        String[] array = {"java", "phython", "javascript", "c++", "java", "c++"};
        System.out.println(ascending(array));
    }
}