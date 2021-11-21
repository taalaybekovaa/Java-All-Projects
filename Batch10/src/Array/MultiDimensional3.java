package Array;

import java.util.Arrays;

public class MultiDimensional3 {
    public static void main(String[] args) {

        int [] ids={3,4,2,34,56,7};
                             //bigger array and inside of the {{}}inner array
        int [][] multiDem={{ 60123,60124,60125 },{ 9123,9124,9125 },{5123,5124, 5125,5126} };
        //multiDem [2][4]=5234;// ArrayIndexOutOfBoundException since there is no 4th index it throws an exception
        System.out.println(Arrays.deepToString(multiDem));// to print out array with inner arrays
        int [][] multiDem1=new int[1][5];
                                //how much we going to pit
        System.out.println(Arrays.deepToString(multiDem1));
        // declaration

        int[][] numbers=new int[3][4];
        System.out.println(Arrays.deepToString(multiDem1));


    }
}
