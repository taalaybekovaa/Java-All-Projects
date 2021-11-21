package Array;

import java.util.Arrays;

public class SplitPractice {

    public static void main(String[] args) {

        String str="The fall season is coming";
        //str.split(" ");// is going to split by elements
        String[] words=str.split(" ");//space also cut with the spaces, what you put in parameters
        // otherwise it's going to show you all elements separetly
        System.out.println(Arrays.toString(words));// It's going to return everything, you can't execute only 3, ,-space separation
        String [] words2=str.split("a");
        System.out.println(Arrays.toString(words2));// [The f, ll se, son is coming]
        // 3 element The f-1 element, ll se-2nd element , son is coming-3rd element)


    }
}
