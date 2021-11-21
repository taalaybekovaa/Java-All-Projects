    package Homework9;

    import java.util.Arrays;

    public class Task6 {

        public static void main(String[] args) {

            /* You have an array of 6 int numbers and get the square of each number from the array.*/

            int[] numbers = new int[6];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i]=i+1;
                numbers[i]*=numbers[i];
            }
            System.out.print("The square of each number is: ");
            System.out.println(Arrays.toString(numbers));

        }
    }