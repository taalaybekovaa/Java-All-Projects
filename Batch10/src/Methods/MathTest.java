package Methods;

public class MathTest {

    public static void main (String [] args){

        Math object=new Math();
        object.sum(4,6);
        object.sum(5,25);

      //  Math obj1=new Math();
       // obj1.sum(1,1);
        object.operation("multiply", 4,2);

        object.operation("hgjdsf", 3,5);

        int x =object.sum1(1,3,6);

        System.out.println(x+25);

        //int w=object.sum(2,3);
        //void return type doesn't return any value
        //that's why you cannot store the outcome into any variables


    }
}
