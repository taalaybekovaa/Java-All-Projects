package Methods;

public class AgeCalculatorTest {

    public static void main(String[] args) {

        AgeCalculator tom=new AgeCalculator();
        tom.AgeCalculator(2000);
        int b=tom.AgeCalculator();

        if(b==25){
            System.out.println("You must be happy");

        }
       String x=tom.AgeCalculator(2000,"John");
        System.out.println(x);
    }
}
