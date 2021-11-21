package MAP;

import java.util.Random;

public class GettingARandomDigit {

    public static void main(String[] args) {
        Random random = new Random();
    //    random.nextInt();
     //   System.out.println(random.nextInt());
        // Line below only gives us one digit at a time
        System.out.println(random.nextInt(10)); // 0 1 2 3 4 5 6 7 8 9

        // I need sixteen digit
        // i is only going to determine how many times this for loop is going to run
        // This loop is going to run(iterate) 16 times
        String SixTeenDigitString="";
        for (int i = 1; i <=16 ; i++) {
            // I know I can add numbers in string
          SixTeenDigitString+=  random.nextInt(10);
          // Giving ten means all values you are gonna get start from zero and smalller than 10
        }
        System.out.println(SixTeenDigitString);
        // My number datatype is String while I should return a long value
        // I need to convert String data type to Long
        long digit16 = Long.parseLong(SixTeenDigitString);


    }

}
