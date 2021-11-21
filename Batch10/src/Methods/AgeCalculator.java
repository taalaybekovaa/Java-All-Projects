package Methods;

public class AgeCalculator {

    // create a method that will take
    // one int parameter for your birthYear and than this method simply calculates and prints your age

    public void AgeCalculator(int birthYear){
        int age=2021-birthYear;
        System.out.println("Your age is :"+age);

    }

    public int AgeCalculator(){
        int age=2021-2015;
        System.out.println("Your age is :"+age);

        return age;
    }
    //overload this method by passing string parameter which
    // is going to be name of the person
    //and print out the age of the person as:
    //".....your age is..."

    public String  AgeCalculator(int birthYear,String name){
       int age=2021-birthYear;
      System.out.println("Your name is : "+name+"Your age is :"+age);
        return ""+name+"your age is"+age;
    }




    public static void main(String[] args) {
        AgeCalculator jerry=new AgeCalculator();
        jerry.AgeCalculator(2000);

    }
}
