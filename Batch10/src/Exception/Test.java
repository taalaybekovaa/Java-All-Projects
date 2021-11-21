package Exception;

public class Test {



//        System.out.println("This is my first Print before exception");

    public static void main(String[] args) {
        int a = 9;
        try {
            String str = "35c";
            int number = Integer.parseInt(str);
            System.out.println(number);
        } catch (IllegalArgumentException exception) {
            a = 5;
            int number2 = 25;
            System.out.println("This is inside of CATCH block");
        } finally {
            System.out.println("Finally Block");
        }
    }
}
