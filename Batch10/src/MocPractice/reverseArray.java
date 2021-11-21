package MocPractice;

import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {

        int [] nums ={45,62,7,67, 23,35,11};
//        int firstN=0;//index
//        int lastN=nums.length-1;
//
//        while(firstN<lastN){
//            int temp=nums[firstN];
//            nums[firstN]=nums[lastN];
//            nums[lastN]=temp;
//            firstN=firstN+1;
//            lastN=lastN-1;
//
//        }
//        System.out.println(Arrays.toString(nums));


        System.out.println("Original Array printed in reverse order:");
        for(int i=nums.length-1;i>=0;i--)
            System.out.print(nums[i] + "  ");
    }
    }

