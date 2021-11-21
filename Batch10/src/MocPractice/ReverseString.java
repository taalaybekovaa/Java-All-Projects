package MocPractice;

public class ReverseString {

    //Write a java program to reverse String word by word?
    public static void main(String[] args) {
//        String words = " Hello Techtorial";
//        // 1 way is using charAt();
//        String reverse = "";
////
//     for(int i=word.length()-1; i>=0;i--){
//         reverse+=word.charAt(i);
//     }
//        System.out.println(reverse);
//        }
//    }
        //2 way using to CharArray();

//        char[] array = words.toCharArray();
//
//        for (int i = array.length - 1; i >= 0; i--) {
//            reverse += array[i];
//        }
//        System.out.println(reverse);
//    }
//}
        // 3 way using substring ();
//
//        for (int i = words.length(); i>=1; i--) {
//            reverse += words.substring(i - 1, i);
//        }
//        System.out.println(reverse);

        //Using String buffer

//        StringBuffer sb = new StringBuffer(words);
//        System.out.println(sb.reverse());
// Using String Builder
//        StringBuilder sb= new StringBuilder(words);
//        System.out.println(sb.reverse());

        // Split word by word

//        String str= " I love Java";
//        String reverse="";
//
//        String [] array=str.split(" ");
//
//        for(int i= array.length-1;i>=0; i--){
//            reverse=reverse+array[i]+" ";
//
//        }
//        System.out.println(reverse);

        //Reverse each word in the sentence

        String str=" I love Java";
        String reverse="";
        String [] array=str.split(" ");

        for (int i =0;i< array.length;i++){
            String word=" ";
            for (int j = array[i].length()-1; j >=0; j--) {
                word+=array[i].charAt(j);}
            reverse=reverse+word+" ";}
        System.out.println(reverse);

            }
        }

