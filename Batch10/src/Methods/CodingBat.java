package Methods;

public class CodingBat {

    public static boolean firstLast6(int[] nums) {

        /*Given an array of ints, return true if 6 appears as either the first or last element in the array.
         The array will be length 1 or more.

        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false*/
        int[] array = {1, 2, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[0] == 6 && array.length - 1 == 6) {
                return true;
            }
            if (array[0] != 6 && array.length - 1 != 6) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CodingBat test = new CodingBat();
        int[] array = new int[]{6, 6, 8, 9,};

    }
}
