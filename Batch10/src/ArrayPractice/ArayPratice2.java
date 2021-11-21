package ArrayPractice;

import java.util.Arrays;

public class ArayPratice2 {

    public static void main(String[] args) {

        String name="Hello Java is so cool";
        String[] split =name.split(" ");
        System.out.println(Arrays.toString(split));

        for(int i=0; i<split.length;i++){
            String reverse="";
        for(int k=split[i].length()-1;k>=0;k--){
            reverse+=split[i].charAt(k);
            // 1st looking for word, 2 nd for each letter
        }
            System.out.println(reverse.charAt(0));
            System.out.println(reverse.charAt(reverse.length()-1));
            System.out.println(reverse);

        }
    }
}
