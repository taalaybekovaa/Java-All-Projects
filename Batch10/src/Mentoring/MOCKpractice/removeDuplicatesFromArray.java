package Mentoring.MOCKpractice;

import java.util.Set;
import java.util.TreeSet;

public class removeDuplicatesFromArray {

    public static void main(String[] args) {

        String[] months={"Jan","Feb","Mar","Apr","Jan","Mar","May","May", "May", "May"};

        Set set= new TreeSet();

        for (int i = 0; i < months.length; i++) {
            set.add(months[i]);
        }
        System.out.println(set);
    }
}
