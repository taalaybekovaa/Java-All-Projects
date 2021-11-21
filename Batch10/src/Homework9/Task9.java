package Homework9;

import java.util.Arrays;

public class Task9 {

    public static void main(String[] args) {

        /* Create the following array size of 13 and store the following number {4, 4, 5, 12, 6, 7,12 7,1, 1, 2, 2, 3}
        Print all unique values from this array.Output:3 5 6 */

        int [] numbers= {4, 4, 5, 12, 6, 7,12, 7,1, 1, 2, 2, 3};
        int [] uniqueNumbers= new int[13];
        int i=0, j=0, count=0;
        boolean isUnique;

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(numbers);

        while(i<numbers.length){
            isUnique=true;
            while(j< numbers.length){
                if(numbers[i] == numbers[j] && i!=j){
                isUnique=false;
                }
                j++;
            }
            j=0;
            if(isUnique){
                uniqueNumbers[count]= numbers[i];
                count++;
            }
            i++;
        }

        for (i=0;i<uniqueNumbers.length;i++){
            if (uniqueNumbers[i]==0){
                break;
            }
            if(uniqueNumbers[i+1]!=0){
                System.out.print(uniqueNumbers[i]+", ");
            }
            else {
                System.out.print(uniqueNumbers[i]);
            }
        }
    }
}
