package MAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Practice2 {

    public static void main(String[] args) {

        HashMap <Integer, String> map= new HashMap();
        map.put(1, "Des Plains");
        map.put(2, "lake Forest");
        map.put(3, "Chicago");
        map.put(4, "Austin");
        map.put(5, "New York");
        // size method to check the size and teh number of the elemnets

        System.out.println(map.size());
        map.put(null,null);
        System.out.println(map);// to see all values
        map.put(1, "Schamburg");
        System.out.println(map);

         map.replace(1,"XXXX");// to replace/ update the value
         System.out.println(map);
         map.replace(1, "XXXX", "YYYY");// instead of XXXX do YYYY if you acsedently put the value
         System.out.println(map);

        Boolean b1= map.containsKey(2);// returning type is boolean the result is true
         boolean bl= map.containsKey(3);// searching for the key
         boolean b2=map.containsValue("Washington");
        System.out.println(b2);

        map.remove(1);
        System.out.println(map);

        System.out.println();
//         map.clear();
//        System.out.println(map);
//
        // Print all the values from this map one by one
map.put(1, "Des Plains");
        Set <Integer> city= map.keySet();// calling teh method to reach elements one by one
        // storing the result in here
        for (Integer city2: city ){
            System.out.println(map.get(city2));// to show teh result one by one

            Collection<String> cities= map.values();// We can use the list bc collection is the larger than the list,
            // it has more features bc it's parent
            System.out.println(cities);

            for (String zipcode: map.values()) /* instead of providing the name of the storage u can use map.values*/ {
                System.out.println(zipcode);
            }


        }
    }
}
