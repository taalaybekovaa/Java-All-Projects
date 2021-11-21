package OOP.Interface;

public class Square implements Shape {

   @Override
   public Number area(int side){
        return side*side;
    }

    public Double  perimeter(){
        return 10.1;
    }
}
