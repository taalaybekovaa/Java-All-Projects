package MAP;

import java.util.HashMap;

public class CountAndStorePractice {

    public static void main(String[] args) {

        // Find every single brand count how many of each you have in a single array
        // ID Value
        // Nike=2
        // Reebok=1
        //Armani=1
        // Clarks=1
        //Adidas =1
        //Puma 3

        String[] brands = {"Nike", "Adidas", "Reebok", "Puma", "Armani", "Clarks", "Nike", "Puma", "Puma"};
        // First step it's to create a HashMap bucket as a brands count
        // to store the ID which is nike, adidas, reebok inside of the new ..


        HashMap<String, Integer> brandsCount = new HashMap<>();//create a bucket to store from array to the map

        for (int i = 0; i < brands.length; i++) {// to check every element
            if (!brandsCount.containsKey(brands[i])) {// if this new bucket doesn't have anything
                // put all keys  from brands inside this bucket by 1
                brandsCount.put(brands[i],1);
            }
            else {// otherwise if there are more than 1 value create int count get every elements from brands
                int count = brandsCount.get(brands[i]);//create an int counter and get all elements from brand
                brandsCount.put(brands[i],count+1);// put into the bucket all elements from brands{i} and count them+1
            }
        }
        System.out.println(brandsCount);
    }
}