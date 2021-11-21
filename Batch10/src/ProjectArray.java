import com.sun.tools.javac.Main;

public class ProjectArray {
    //    /**
//     *
//     * @param arrays of numbers
//     * @return maximum value from array
//     */
//    int max;//to store the max number
//
//    public int maxNum(int[] arrays) { //Write a method that will accept an array as parameter
////     * and return maximum value from array.
////                * <p>
////     * for example:
////     * {3,9,55,73,99,2,10} -> return 99
////                *
    public int maxNum(int[] arrays) {
        int biggest = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {

            if (biggest < arrays[i]) {
                biggest = arrays[i];
            }
        }
        return biggest;

    }

    public int sumOFOdds(int[] array) {
        int sumOfOdds = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                //What we should we do if the current numbers remainder with two doesn't give o?
                sumOfOdds += array[i];
            }

        }
        return sumOfOdds;
    }

    public boolean threeAmigos(int[] array) {
        //index number has to be always smaller than legght of array
        //get the biggest index number you used in for loop and it should be always smaller than lenhght
        // i+2 and 1-1 is the same thing its the biggest number
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) {
                return true;
            }
            if (array[i] % 2 != 0 && array[i + 1] % 2 != 0 && array[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ProjectArray object = new ProjectArray();
        int[] arr = new int[]{3, 7, 8, 9, 0, 1, 0, 5, 8};
        System.out.println(object.threeAmigos(arr));
    }

    public boolean make100With2(int[] nums) {
        OUTER:
        for (int i = 0; i < nums.length; i++) {
            // we alraedy have value for i you don';t need to check the first one you can start ftom 1 index
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 100) {
                    return true;
                }

            }
        }
        return false;
    }

    public int outOfOrder(int[] arr) {
        OUTER:
        for (int i = 0; i + 1 < arr.length; i++) {
            if (arr[i] >= arr[i + 1]) {
                return arr[i + 1];
            }
        }
        return -1;
    }

    public boolean contains12(int[] nums) {
        int indexOf1 =-1;// we need to get smallest index number for 1
        int indexOf2 =-1;// we need to get biggest index number ofr 2
 for(int i=0; i<nums.length;i++){
     if(nums[i]==1&&indexOf1==-1){
         indexOf1=i;
     }
     if(nums[i]==2){
         indexOf2=i;
     }
 }
 if(indexOf1<indexOf2){
     return true;
 }
        return false;
    }
}