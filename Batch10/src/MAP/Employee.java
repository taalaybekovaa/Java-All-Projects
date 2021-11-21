package MAP;

import java.util.Random;

public class Employee {

    String name;
    String city;
    long id;
    int age;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.id = generateId();
        this.age = age;
    }


    public static long generateId(){
        Random random = new Random();// to generate a numbers

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(generateId());
    }
}