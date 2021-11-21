package Array;

import java.util.Arrays;

public class Practice2 {

    public static void main(String[] args) {
        int [] xyz=new int[7];
        int[] zipCodes = {123, 456, 234,};
        String[] data={" J", "K"};
        System.out.println(zipCodes.length);
        System.out.println(zipCodes[0]);
        System.out.println(zipCodes[2]);//ArrayIndexOfBoundsException
        System.out.println(Arrays.toString(zipCodes));

        zipCodes[1] = 999;
        System.out.println(Arrays.toString(zipCodes));

        Object[] objects = {"Red", "Blue", 55, 'A', 6.57, null, false};

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);

            boolean[] conditions = {true, false, false, true, 5 == 5, 5 != 5};
            System.out.println(Arrays.toString(conditions));
            System.out.println("_______________");
            char[] characters={'a', '$', '!','D','7', '1', 65};
            System.out.println(Arrays.toString(characters));
            int [] chars={'A'};
            System.out.println(chars);

        }
    }
}
