package String;

public class substring {
    public static void main(String[]args){

        String str="Techtorial";
         //         0123456789
        String part1=str.substring(2);//When you pass single index number
        // into the substring method it will take partial
        // text starting from that index and it will include that index's char
        System.out.println(part1);

        String part2=str.substring(2,4);//Taking the begining
        // and the middle so it's showing c as 2 and h, not including 4
        //When you pass begining and endix index numbers, it will start from begining index which is included and
        // stop at ending index which is not included
        System.out.println(part2);

        System.out.println(str.substring(0));
        //Print last three chars from string I will do it "I will do it soom

        String text="I will do it SOON";
        String text1=(text.substring(text.length()-3));//If you want go from the end of the word
        // when your string value
        // does not have enough value to take substring it will throw an exeption (StringOutOfBound)
        System.out.println(text1);

        String string1= "ON";
        //System.out.println(string1.substring(string1.length()-3));//Error
        // because there is no enought words that's why it's giving the error

        String name="Milk";
        System.out.println(name.substring(1));







    }
}
