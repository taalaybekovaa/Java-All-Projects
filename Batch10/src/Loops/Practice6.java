package Loops;

public class Practice6 {

    public static void main(String[] args) {
     //Summer ---> print out every single letter from this word one by one
     // S, u, m, m , e , r

        String word="Summer";
        int index=0;

        while(index<word.length()){
            System.out.print(word.charAt(index)+" ,");//S, u, m , m , e , r,//ln-separate, print on the same line
            index++;
        }


        }
    }

