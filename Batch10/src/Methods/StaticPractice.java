package Methods;

public class StaticPractice {

    String name;
    int age;
    String color;

  // static
    static int foodAmount=20;// if we are going to do static
    // it's been reflected and sharable between different objects. In non static-not sharable
    //You cannot do local variables as a static

    public void eat(){
        foodAmount-=1;
        System.out.println(" Left over food is: "+foodAmount);
    }
    public static void run(){
        //static  int a=23;You cannot do local variables as a static
        System.out.println("Cat is running");
    }


    public static void main(String[] args) {
        StaticPractice cat=new StaticPractice();
        cat.name="Felix";
        cat.age=3;
        cat.color="White";
        cat.eat();

        //You can call static method with the ways below:

        cat.run();
        run();
        StaticPractice.run();

        System.out.println();

        StaticPractice cat1=new StaticPractice();
        cat1.name="Moorzik";
        cat1.age=4;
        cat1.color="Black";
        cat1.eat();

        cat.name="Jef";
        foodAmount-=1;
        cat1.name="Zoya";
        foodAmount-=1;


    }
}
