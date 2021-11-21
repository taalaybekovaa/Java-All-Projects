package Constructor;

public class CarTest {

         /* create a car class with instance field of brand of the car
    create one move method to simply print out " car is moving"
    create a constructor to initialize instance varibles
    create a test calls to test this car class
    inside of the test class create multiple objects
    sent some of the object to garbage
    call garbage collector
    make sure gc() is working;
     */

    public static void main(String[] args) {
        Car car1 = new Car("Lexus");
        Car car2 = new Car("Lexus");
        Car car3 = new Car( "Lexus");
        Car car4 = new Car("BMW");

        Car car5= new Car("BMW");
        Car car6= new Car("BMW");
        car1=null;
        String str="Test";
        String str2="Test";



        System.out.println(car4);
      //  System.gc();
        //equals() vs ==
        System.out.println(car2.equals(car3));//
        System.out.println(str==str2);
        String str3= new String("Test");
        String str4= new String("Test");
        System.out.println(car4);

        System.out.println(car2.equals(car3));

    }
}
