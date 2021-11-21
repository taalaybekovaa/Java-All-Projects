package OOP.Interface;

public class Triangle implements Shape {

    int height;
    @Override

    public Integer area(int side) {
        return (side*height)/2;
    }

    @Override
    public Integer perimeter() {
        return 11;

    }

    public Integer area(int side, int height) {
        return 4;
    }
public void info() {
        System.out.println("I am info from Triangle");
    }

}
