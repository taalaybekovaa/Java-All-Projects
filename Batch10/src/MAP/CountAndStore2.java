package MAP;

import java.util.HashMap;
import java.util.HashSet;

public class CountAndStore2 {

    public static void main(String[] args) {

        String string = "It is easy with practice";
//I- 1
//t-3
//i-3
//s-2             ID        Value
        HashMap <Character,Integer> letters = new HashMap();//

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == ' ') {// to skip spaces
                continue;// skip and don't count
            }
            if (!letters.containsKey(string.charAt(i))) {

                letters.put(string.charAt(i), 1);

            } else {

                letters.put(string.charAt(i), letters.get(string.charAt(i)) + 1);

            }
        }
        System.out.println(letters);
    }
}