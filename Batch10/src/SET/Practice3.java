package SET;

import java.lang.reflect.Array;
import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        //you are given an  array of colors
        // find out and store duplicate elements in to an Array list from this array
        // eliminate duplicate
        String[]  colors={"red","black", "black", "white", "red", "orange"};
       List list = Arrays.asList(colors);//toaRRAYlIST
       HashSet hashSet = new HashSet(list);// to remove duplicates
        HashSet hashSet1= new HashSet(Arrays.asList(args));// show me without dublicates
        System.out.println(hashSet);
        System.out.println(list);

        // find out and store duplicate elements in to an ArrayList from this array

        ArrayList list2 =new ArrayList();//storage for the duplicates
        HashSet set2 =new HashSet();

//        for( String color: colors){
//            set2.add(color);
//        }
//        System.out.println(set2);

        for( String color: colors){
            if( !set2.add(color)){//if no dublicates in colors
                list2.add(color);// show updated color without dublicates
            }
            System.out.println(set2);
        }
    }




}