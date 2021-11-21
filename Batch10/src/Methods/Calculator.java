package Methods;

public class Calculator {

    // one method with public access modifier
    //lets call in this class
    // we should fid int parameter and we should find square of the parameter and fine

    public static int findSquare(int square){//if other than void we need to create a return
        return square*square;


    }public long findSquare(long square){
        return square*square;
    }
    //since we are in some class we can just call with method name

    public static void main(String[] args) {
        System.out.println(findSquare(21));
        long long1=4;
        Calculator calculator=new Calculator();
        calculator.findSquare(long1);

        //findSquare(long1); Since we didn't create an object in the static method we can't call only non-static method
    }
}
