package StringBuilder;

import MAP.Practice4;

public class Ptractice4 {

    //craete a method that will tale a StringBuilder as a parmeter
    //this method will calculate and return sum of digits from, given
    // "urjsd123idfvne5y24fgier" ;


    public static void main(String[] args) {
        Practice4 obj = new Practice4();
        StringBuilder stringBuilder = new StringBuilder("urjsd123idfvne5y24fgier");
       // System.out.println(obj.sumOfDigits);
    }

    public int sumOfDigits(StringBuilder builder) {
        int sum = 0;
        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);
            if (Character.isDigit(ch)) {
                int number=Integer.parseInt(String.valueOf(ch));
                sum = sum + number;
            }
        }
        return sum;
    }
}