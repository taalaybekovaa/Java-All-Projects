package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {

int[] numbers = {45, 5, 6, 47, 57, 8, 12, 0, 30};

// going from smaller to larger
    System.out.println(Arrays.toString(numbers));// showing all numbers in array
    Arrays.sort(numbers);// sort method will put elements in ascending order(from smaller to larger)
    System.out.println(Arrays.toString(numbers));

    String[] colors={" Red", "Yellow", " Brown","Blue", "White", "Orange", "Green", "Pink", "Violet", "Black","12","43","aAbc","aABc"};
    System.out.println(Arrays.toString(colors));

    Arrays.sort(colors);
    System.out.println(Arrays.toString(colors).toLowerCase());

    for(int i=0; i< colors.length; i++){
    colors[i]=colors[i].toLowerCase();
    }Arrays.sort(colors);
    System.out.println(Arrays.toString(colors));

}
}
