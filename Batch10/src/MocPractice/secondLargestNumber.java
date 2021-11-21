package MocPractice;
public class secondLargestNumber {
    public static void main(String[] args) {

        //Write a Java program to find the second largest number in the array?
        //Maximum and minimum number in the array
        //Second largest number in the array
        //Simple way

        int[] array = {100, 300, 200, 450, 350};
        int largest = Integer.MIN_VALUE; //array [i]creating int biggest number and assigning lowest integer which is 0 index
        //we are going to compare 0 index with the next number if the number bigger than 0 index the biggest number is the next number
        //we can also do int biggest=arrays[0];
        int second = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                second = largest;
                largest = array[i];
            } else if (array[i] > second && array[i] != 0) {
                second = array[i];
            }
        }
        System.out.println(" The largest number from this array is : " + largest + " The second largest number is:" + second);

    }
}
