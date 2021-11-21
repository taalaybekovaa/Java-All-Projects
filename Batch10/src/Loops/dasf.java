package Loops;


public class dasf {

        public static void main(String[] args) {
            int number=12345;
            int rev_num=0;
            while(number>0){
                rev_num = rev_num * 10 + number % 10;
                number = number / 10;
            }
            System.out.println(rev_num);



    }


}

