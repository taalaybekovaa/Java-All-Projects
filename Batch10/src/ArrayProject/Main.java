package ArrayProject;

import com.sun.jdi.connect.ListeningConnector;

public class Main {

    public int maxNum(int[] arrays) {

        /** @param arrays of numbers
         * @return maximum value from arrayp
         *
         *   int max;//to store the max number
         *
         *    public int maxNum(int[] arrays) { //Write a method that will accept an array as parameter
         * and return maximum value from array.
         * <p>
         * for example:
         * {3,9,55,73,99,2,10} -> return 99*/


        int biggest=Integer.MIN_VALUE; //array [i]creating int biggest number and assigning lowest integer which is 0 index
        //we are going to compare 0 index with the next number if the number bigger than 0 index the biggest number is the next number
        //we can also do int biggest=arrays[0];
        for (int i = 0; i <arrays.length ; i++) {
            // In this for loop element that we are currently checking is arrays[i]
            if (biggest<arrays[i]){// if current biggest smaller than array[i]
                biggest=arrays[i];//reassign change biggest will bne equals to array i
               //we are checking what number is the biggest number and then reassign
            }
        }
        return biggest;//return biggest number from array
    }

    /**
     * Write a method that received an integer array and returns the sum of all
     * odd numbers in the array
     *
     * @param array
     * @return sum of odd numbers in the array
     *
     * How can we find if it can be divided by two or not?
     *  numbers remainde with two shouldn't give 0
     *
     */
    public int sumOfOdds(int[] array) {
        // TODO
        int sumOfOdds=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2!=0){
                // What should we do if the current number's remainder with two doesn't give 0?
                sumOfOdds+=array[i];// we need to add to sumOfOdds current number
            }
        }
        return sumOfOdds;
    }

    /**
     * Write a method that takes an array of integers and returns a boolean. You
     * method should return true if array contains three consecutive even number
     * or three consecutive odd numbers. Return false otherwise.
     * threeAmigos([2, 1, 3, 5]) -> true
     * threeAmigos([2, 1, 2, 5]) -> false
     * threeAmigos([2, 4, 2, 5]) -> true
     *
     */

    public boolean threeAmigos(int[] array) {
        // TODO
        // We need to create a loop
        // In the loop instead of checking one element we need to check three consecutive one
        // Either they should be all even or all odd.

        // What is the biggest index number we have used in this for loop?
        // it is i+2
        // What is the rule for index numbers in for loop?
        // Index number has to be always smaller than length of array.
        // Write the biggest index number you used in for loop and say it should always be smaller than length
        for (int i = 0; i+2<array.length ; i++) {
            // // We are checking if all three of them are consecutive even
            if (array[i]%2==0&&array[i+1]%2==0&&array[i+2]%2==0){
                return true;
            }
            // We are checking if all three of them are consecutive odd
            if (array[i]%2!=0&&array[i+1]%2!=0&&array[i+2]%2!=0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Main object= new Main();
        int [] arr= new int[]{3,7,8,9,0,1,0,5,8};
        System.out.println(object.maxNum(arr));
    }

    /**
     * Write a method that takes an array of ints and returns a boolean.
     * Return true if that array contains two numbers anywhere in the array
     * whose sum is 100
     *  {100,45,20,}
     * @param nums
     * @return boolean
     */
    public boolean make100With2(int[] nums) {
        // TODO
        OUTER:for (int i = 0; i <nums.length ; i++) {
            // we already have value for i
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==100){
                    return true;
                }
            }
        }
        return false;
    }


    /**
     *
     * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
     * Your method should switch the order of the first two values,
     * then switch the order of the next two, switch the order of the next two, and so on.
     *
     * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
     * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
     *
     * Method that is using String[]
     * @param Array
     * @return switched pairs array
     */
    public String[] switchPairs(String[] list){
        //TODO
        return null;
    }

    /**
     *
     * @param array of book pages
     * @return page that is out of order; if all pages in the order return -1;
     *
     * For example you given an array
     * // Order rule is numbers should go lower to higher
     *  int[]pages={20,100,55,78,44,90}; -> method will return 55
     * int[]pages2={20,21,22,78,44,90};-> method will return 44
     *  int[]pages3={20,21,22,78,84,90};-> method will return -1
     */
    public int outOfOrder(int[] arr){
        //TODO
        // We have to find where the order rule is broken.
        // What is order rule
        // We need to return when the next number is smaller or equals to previous number
        for (int i = 0; i+1<arr.length ; i++) {
            // arr[i] represents the current number
            // arr[i+1] represents the next number// We are comparig the next number becouse the next number is breaking the rule
            if (arr[i]>=arr[i+1]){
                return arr[i+1];
            }
        }
        return -1;
    }

    /**
     *
     * Write a method that takes an array of integers and returns a boolean.
     * Return true if the array contains 1 and 2 later somewhere in the array,
     * and 1 has to come before 2.
     *
     * contains12([1, 3, 2]) -> true
     * contains12([2,1,3, 2,1]) -> true
     * contains12([3, 1, 4, 5, 2]) -> true
     * contains12([3, 2, 4, 5, 1]) -> false
     *
     * @param nums
     * @return boolean
     */

    public static boolean contains12(int[] nums) {

        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

//        int indexOf1=-1;// we need to get smallest index number for 1 // we need to get index number of first 1 in the array
//        int indexOf2=-1; // we need to get biggest index number for 2
//        for (int i = 0; i <nums.length ; i++) {3,3,5,1,2,1
//            if (nums[i]==1&&indexOf1==-1){
//                // The first index number of 1
//                indexOf1=i;
//            }
//            if (nums[i]==2){
//                indexOf2=i;
           // }
      //  }
//        // TODO
//        if (indexOf1<indexOf2){
//            return true;
//        }
//        return false;
  //  }


    /**
     * Write a method that will accept array of integers as parameter
     * and will return one long number of combined numbers.
     * If the number is negative accept it as positive
     *
     * For example:
     * {2,66,3,90,1,-10} -> return int 266390110
     * {0,34,5,3,8} -> return int 34538
     *
     * @param array of numbers
     * @return combined numbers of array
     *
     *
     */

    public long combineNumbers(int[] numbers) {
        //TODO
        return -1;
    }

    /**
     * Write a method that will accept one array as parameter and will remove duplicates
     * and return will have unique numbers inside
     *
     * for example:
     * {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
     * {-1,5,8,-1,-55,55,0} -> return {-1,5,8,-55,55,0}
     *
     * @param array of numbers
     * @return array of unique numbers
     */
    public int[] removeDuplicates(int[] nums) {
        // Everytime we create the array we have to provide a lenght
        //The array we are going to return is
        //going to have repeating number lee lenght than the original one. We need to find how many repeating numbers are there
        int repeatingNumber=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    repeatingNumber++;
                }
            }
        }
        int [] numbers=new int[nums.length-repeatingNumber];
        int count=0;
        for (int i = 0; i <nums.length; i++) {
            boolean isContains = false;
            for (int j = 0; j <numbers.length ; j++) {


                if (nums[i]==numbers[j]){
                    isContains=true;
                    //If cond is true its means numbers array containing the nums[i]
                }

        } if (isContains==false){
                numbers[count++]=nums[i];
            }
        }
        return null;
    }
}
