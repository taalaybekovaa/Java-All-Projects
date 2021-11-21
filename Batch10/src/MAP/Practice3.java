package MAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice3 {

    private static Object HashMap;

    public static void main(String[] args) {

        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("IT", 111);
        dataMap.put("HR", 222);
        dataMap.put("Help", 333);
        dataMap.put("Admin", 444);

        System.out.println(dataMap);
        System.out.println(dataMap.entrySet());
        Set <Map.Entry<String, Integer>> data= dataMap.entrySet();// returning a set of entries
        System.out.println(data);
      //  printOut (dataMap);
        // get indvidual values
        // get all values
        // get single elements
        //entrySet
        // print out elements from this set one at a time

        for (Map.Entry<String, Integer> keyAndValue: data){/* one by one on the separate lines
            // Help=333
            HR=222
            IT=111
            Admin=444*/

            System.out.println(keyAndValue);}
        }

   // create a method which takes a parameter of map and this method will print out each extension one by one
        public static void printValues(HashMap <String, Integer> map){
            for ( Integer extension: map.values())
                System.out.println(extension);


    }
}
