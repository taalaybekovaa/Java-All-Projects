package SET;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {

    public static void main(String[] args) {

        HashSet set1 = new HashSet();//how to create HashSet slass
        HashSet <String> set2= new HashSet<>();//how to create HashSet
        Set <String> set3= new HashSet();//how to create HashSet

        set1.add("Chicago");
        set1.add("Dalas");
        set1.add("Columbus");
        set1.add("Denever");
        set1.add("New York");
        set1.add(12);
        set1.add(true);
        System.out.println(set1);
        set1.add(null);
        System.out.println(set1);
        set1.add("Chicago");
        System.out.println(set1);
        System.out.println(set1);// There is no get() method to reach out for specific element
        boolean yes=  set1.contains("Chicago");
        System.out.println(yes);
        for(Object x:set1){
            System.out.println(x);
        }
//        for(Object x:set1){
//            if (set1.contains("Denver")){
//                System.out.println(">>>>>>>>>>"+x);

        set1.remove(null);
        System.out.println(set1);

        for(Object x:set1){
          if(x.equals("Denever")){
              System.out.println(">>>>>>>>>>>"+x);


        }
        }
        for (int i = 0; i <set2.size() ; i++) {
            if (set1.contains("Denever")){
                System.out.println("Denever");
                break;
            }
            }
        set1.clear();
        System.out.println(set1);
        }
        }

