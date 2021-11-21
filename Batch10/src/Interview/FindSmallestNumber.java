package Interview;

public class FindSmallestNumber {

    public static void main(String[] args) {

        int[] numbers1 = {45, 5, 6, 47, 57, 8, 12, 0, 30, -25};
        int smallestNumbers=numbers1[0];
        for (int i = 1; i < numbers1.length; i++) {
            if (numbers1[i]<smallestNumbers) {
                smallestNumbers=numbers1[i];

            } System.out.println("Smallest number is"+smallestNumbers);
        }
    }
}
