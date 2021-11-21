package MocPractice;

import java.awt.*;
import java.util.*;
import java.util.List;

public class removeDuplicatesfromArrayList {

    public static void main(String[] args) {

        List<Object> list1 = Arrays.asList("John", "Jane", "John", "Jane", "James", "Jasmine", "Jane", "Jasmine", "Jane");

        Set set = new HashSet(list1);
        System.out.println(set);

        // HashSet
        HashSet set1= new HashSet();
        for( Object arr: list1){ // data type name : name of the storage with arrays
            set.add(arr);
        }
        System.out.println(set);

    }
}