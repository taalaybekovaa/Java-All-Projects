package OOP.Abstraction;

public class CampusStudent extends Student {

    @Override
    public void sleep() {
        System.out.println("On campus student is sleeping");
    }

    @Override
    public void attend() {
        System.out.println("On campus student is attending");
    }

    @Override
    public int studyTime(int hour) {
        return 8;
    }
}

