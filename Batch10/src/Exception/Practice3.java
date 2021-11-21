//package Exception;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Practice3 {
//
//    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
//
//        FileInputStream file = new FileInputStream("Test.txt");
//
//        Scanner scanner = new Scanner(file);
//
//        while (scanner.hasNext()) {
//
//            System.out.println(scanner.nextLine());
//        }
//        int a = 5;
//        int b = 10;
//
//        if(a<b){
//
//            throw new RuntimeException();
//
//        }
//        else if(a>b){
//            throw new IndexOutOfBoundsException(" You are going out of bound");
//
//        }
//
//        int a = 15;
//        int b =10;
//
//        Thread.sleep(3000);
//
//        System.out.println("This is after thread Sleep ");
//    }
//}