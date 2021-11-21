package Array;

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {

        int[] numbers=new int[5];
        //once you set capacity you can't update later,

        // only in the beginning

        System.out.println(numbers);
        numbers[0]=11;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);//bc you didn't put the value
        numbers[1]=22;
        numbers[4]=44;
        System.out.println(numbers[4]);//44
        numbers[5]=34;//It will give ArrayIndexOutOfBoundsException since there is no 5th index

        System.out.println(Arrays.toString(numbers));//pull ap all arrays as a string, whatever we have inside we going to see it all
//To see all elements we can use loop in here
        System.out.println(numbers.length);

        for (int i=0;i< numbers.length; i++){
            System.out.println("from for loop>> "+numbers[i]);

        }




    }
}
