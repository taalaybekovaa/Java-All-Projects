package Methods;

public class OverloadingPractice {

    /*
     create a method that will take a double parameters and thos method will ne named as areaCalculator
     it will return the area
     */

    public double areaCalculator(double lenght, double width) {
        double area = lenght * width;
        System.out.println(" The area is " + area);
        return area;

        //return length*width you can do it to
    }

//    public static void main(String[] args) {
//        OverloadingPractice object = new OverloadingPractice();
//        System.out.println(object.areaCalculator(1.2,3.4));
//        double area= object.areaCalculator(3, 4.5);
//        System.out.println(area);

//calculate the area for square
// formula  A =l*l

public double areaCalculator(double length){
        double area=length*length;
        return area;
}
}//ivate double areaCalculator (String length){


