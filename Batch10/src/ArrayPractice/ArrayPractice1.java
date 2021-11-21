package ArrayPractice;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args){

int[] array = {5,8,23,18,56,7,6,93,63,51,43,78,4,93};
int sumOfEven=0;
int sumOfOdd=0;

for(int a:array){
        if(a%2==0){

           sumOfEven+=a;
            //System.out.println("Your number is even number"+sumOfEven);
        }else{
            sumOfOdd+=a;
        }
        }System.out.println("Your number is not even number  "+sumOfOdd);

}

}
