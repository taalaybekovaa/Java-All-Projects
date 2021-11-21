package MAP;

import java.util.HashMap;

public class CountAndStore2Practice {

    public static void main(String[] args) {
    //Count every letter without space

        String string = "It is easy with practice";
        //I- 1
        //t-3
        //i-3
        // s-2

        HashMap<Character,Integer> letter=new HashMap();//bucket creation to do String as a map

        for (int i=0; i<string.length();i++){
            if(string.charAt(i) ==' '){// if contains space
                continue;//skip next line
            }
            if (!letter.containsKey(string.charAt(i))){// if new bucket doesn't contains anything
                letter.put(string.charAt(i),1);// than put inside of new bucket string by 1
            }else{// otherwise put inside bucket tring and get count elements +1
                letter.put(string.charAt(i), letter.get(string.charAt(i))+1);
            }
            }
        System.out.println(letter);
        }

    }