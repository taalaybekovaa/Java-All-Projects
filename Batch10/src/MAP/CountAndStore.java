package MAP;

import java.util.HashMap;
import java.util.List;

public class CountAndStore {

    // Find every single brand count how many of each you have in a single array

    // nike--2
    // adidas--1
    // reebok--1
    // puma---3...

    public static void main(String[] args) {

        String[] brands = {" Nike", "Adidas", "Reebok", "Puma", "Armani", "Clarks", "Nike", "Puma", "Puma"};

        HashMap<String, Integer> brandCount = new HashMap<>();

        for (int i = 0; i < brands.length; i++) {

            if (!brandCount.containsKey(brands[i])) {
                brandCount.put(brands[i], 1);
            } else {
                int count = brandCount.get(brands[i]);
                brandCount.put(brands[i], count + 1);
                //brandCount.put(brands[i],brandCount.get(brands[i]+1)
            }
        }
        System.out.println(brandCount);
    }
}