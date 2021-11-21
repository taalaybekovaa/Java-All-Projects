import java.util.Random;

public class Student {

    String name;
    String lastName;
    int age;


    public void sleep(String place){
   int hour= generateHours();
        System.out.println(name+" is sleeping"+hour+"hours");

    }
 public void study(){
     System.out.println(name+"is studying"+generateHours()+"hours");
    }
 public void run(int hour){
     System.out.println(name+"is running"+generateHours()+"hours");
 }
public int generateHours(){
        Random random= new Random();
      int hour=  random.nextInt();
    System.out.println();

    return hour;

}





    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alex";
        student1.lastName = "Noon";
        student1.sleep("class");

    }

    }