package MocPractice;

import java.util.Arrays;

public class splitMethod {
    public static void main(String[] args) {

//        //Split method comes from String object
//        // The main reason people are using split
//        //method to split the words from the space
//        String sentence = "Today is beautiful day to recap" +
//                "java with you guys";
//
//        String[] words = sentence.split(" ");
//        for (int i = 0; i < words.length; i++) {
////        System.out.print(words[i].length() + ",");
//        }
//        System.out.println(Arrays.toString(words));
////        System.out.println(words[0].length());
//    }

    String sentence = "Today is beautiful day to recap" +
            "java with you guys";
    String [] words= sentence.split(" "); // it is going to split one by one

        for (int i = 0; i <words.length; i++) {
            System.out.print(words[i]+" , ");
        }
        System.out.println(words.length);
//
//        String techtorial=" Techtorial interview preparation document";
//
//       String [] words=techtorial.split(" ");
//        System.out.println(words.length);
//
//        for (String string: words){
//            System.out.println(string);
        }
    }
