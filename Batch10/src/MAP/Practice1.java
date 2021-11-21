package MAP;

import java.util.HashMap;
import java.util.Set;

public class Practice1 {

    public static void main(String[] args) {

        HashMap <String, String> map = new HashMap();

        map.put("11", "David");
        map.put("22", "Alex");
        map.put("33", "Sorin");

        System.out.println(map);

        map.put("33","Zack");// reassigned to Zack
        System.out.println(map);

        map.put("44","Alex");
        System.out.println(map);

        map.put(null,"Jenny");
        System.out.println(map);

        map.put(null, "Arzu");
        System.out.println(map);// reassigned to Azru bckey should be unique

        map.put("55",null);
        map.put("66",null);
        map.put("77",null);
        System.out.println(map);

        //get()
        System.out.println(map.get("22"));// to get a specific value using ID number
       String nullValue=map.get(null);// to get a specific ID number using the value and we stored the ouput 
        System.out.println(nullValue.concat("****"));// We can concat as it's String data type and use concat 
        
       map.get("11");// You van reach every element by inputig the value but it will be hardcoding
        Set<String> keys=map.keySet(); // To reach one ny one It's returning type
        //storing the result data type | calling method

        System.out.println(keys);//[11, 22, 33, 44, null, 55, 66, 77]

        for (String key: keys){
            System.out.println(map.get(key));// to get the values one by one
        }
        }
        }

