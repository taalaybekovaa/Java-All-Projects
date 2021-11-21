package RecapJavaWithAhmet.ObjectMethod;

import java.util.HashMap;

public class MAP {

    public static void main(String[] args) {

        //1) Can you tell me about map and why do you use Map in your project
        //2) What is the connection between Map ind Collection?
        //3) What is the type of Map and difference between them?
        //4***) HashMap and HashTable

        //1) Can you tell me about map and why do you use Map in your project
        // Map is a way of storing data as a key and value format
        //I love using map in my project bc it has key and value in a map which, which is good for my project
        // to store customers name and values for balance

        //2) What is the connection between Map ind Collection?
        // Map <key, Value> key only stores the unique value which means it is acting like a Set
        //Value may or may not store duplicates as a value which means it is acting lika list

        //3) What is the type of Map and difference between them?
        // HasMap; -> randomly stores
        // LinkedHasMap;    -> insertion order
        // TreeMap;-> ascending order

        //4***) HashMap and HashTable
        //The main difference is thread safe (not synchronized)
        //First come first serve

        //// It means wthe system will wait until the action is done
        //it will continue for the next actions

        String[] brands = {"Apple", "Banana", "Orange", "Peach", "Apple", "Orange", "Strawberry", "Banana", "Apple", "Orange", "Banana", "Apple"};
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < brands.length ; i++) {

            if(!map.containsKey(brands)){
                map.put(brands[i],1);
            } else{
                int count= map.get(brands[i]);
                map.put(brands[i], map.get(brands[i]+1));
            }
        }
        System.out.println(map);

    }
}

