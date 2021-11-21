package Methods;

public class Numbers {

    //Let's write a non=static method to find sum of 2 int numbers


    public int findSum(int a, int b) {
        return a + b;
    }//Let's write a static method to find devision of two numbers

    public static int findDivision(int a, int b) {
return a/b;
    }

    public static void main(String[] args) {
        //Main method is the static method so I should only be able to call static methods ot variables
        //find 4.5
        //For to call findSum method we need to create an object inside the static method
        //This object below is a bridge to call a non-static find sum method
        Numbers numbers= new Numbers();
        numbers.findSum(4,5);

        //Can I call find division with the number object
        //When we create the object for class we can call every method using object
        // Static or non-static doesn't make any difference
        //If we are calling static method in same class we cannot call by using object,
        // but we can call when we are outside of the class
        //Since findDivsion is a static method and I am in same class I can call by using name


        findDivision(20,3);
        Numbers.findDivision(30,4);

    }

}