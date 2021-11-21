package RecapJavaWithAhmet;

public class   multiplicationOfDigits {

    public static void main(String[] args) {

//        int number = 123456;
//        int sum = 0;

        //sum of digit and multiplication of the digit
        // 21  // 720
        // we can find sum of digits by using modulus 10 to access last number

//        while (number != 0) {
//            int digit = number % 10;
//            sum += digit;//to put digits from the last digits to the new bucket it's going to check 654321
//            number /= 10;//smaller
//        }
//        System.out.println(sum);
//    }
//}
//
//        int number = 123456;
//        int sum = 1;// otherwise if you put 0 it's going to show you 0
//
//        while(number!=0){
//         int digit1= number%10;
//         sum*=digit1;//to put digits from the last digits to the new bucket it's going to check 654321
//         number/=10;//smaller
//         }
//         System.out.println(sum);
//}
////      how works do while. You can use do while when ypu would like ti print out something once
        //in do you put what you would like to do and breaker to break a condition and in while you put condition
//        int x = 6;
//        int y = 7;
//        do {
//            System.out.println("hello ");//when you would like to print out something just once
//            y--;
//        } while (y < x);
//    }

//        int choice;
//        do{
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Please enter the number\n1)Enter" +
//                    "\n2)Exit");
//            choice=scan.nextInt();
//
//        int a = 6;
//        int b = 7;
//        do {
//            System.out.println(" Welcome to the club ");
//            b--;
//        }
//        while (b < a);
//
//
//        }
//    }
//        int c=7;
//        int v=8;
//
//        do{
//            System.out.println(" Welcome to the club");
//            v--;
//        } while(v>c);
////    }
////}
//        String word = "Please reverse me";
//        String reverse = "";
//
//        for (int i = word.length()-1; i >=0 ; i--) {
//            reverse+=word.charAt(i);
//        }
//        System.out.println(reverse);
//    }

        // Print out duplicated letters in this sentence. Output should be :   e s r
        String word1 = "Please reverse me";
        String result = "";
        boolean isMatching;

        for (int i = 0; i < word1.length(); i++) {
            isMatching = false;
            for (int j = i + 1; j < word1.length(); j++) {
                if (word1.charAt(i) == word1.charAt(j)) {
                    isMatching = true;
                }
            }
            if(isMatching && result.contains(""+ word1.charAt(i)) && word1.charAt(i) !=' '){
                result+=word1.charAt(i);
            }
        }
        System.out.println(" There are duplicated letters: " + result);
    }
}