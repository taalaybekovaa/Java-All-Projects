package MAP;

import java.util.Random;

public class EmployeePractice {

    String name;
    String city;
    int age;
    int id;

    public EmployeePractice(String name, String city, int age, int id) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = id;

    }
    public static int generateId() {
        int newId = 0;
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int rand = random.nextInt(999_99);
            newId += rand;
        }
            return newId;
        }
    }