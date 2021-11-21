package OOP.Abstraction;

public class Test {

    public static void main(String[] args) {
       // Student st= new Student() {// You cannot have an object from Abstract class
        //Student st = new Student();
        //SelfLearner selfLearner = new SelfLearner();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.study();
        campusStudent.studyTime(8);
        campusStudent.attend();

        Sorin sorin = new Sorin();
        sorin.attend();








    }
}
