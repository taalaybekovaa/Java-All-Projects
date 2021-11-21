//package Methods;
//
//public class TestStudent {
//    public static void main(String[] args) {
//
//        TechtorialStudent student1= new TechtorialStudent();
//        TechtorialStudent student2=new TechtorialStudent();
//        //Static variables are same for every object
//        student1.setStudentName("David");
//        student1.setStudentName("John");
//        System.out.println(student1.studentName);//David
//        System.out.println(student2.studentName);// John
//        // I am going to call a setSchool method and since
//        // it is a static method I can call by using an object or a class name
//        //School name is a static variables
//        //When was teh last time you changed the variables
//        student1.setSchoolName("Techtorial");
//        System.out.println(student2.schoolName);
//        student2.setSchoolName("Tech School");
//        System.out.println(student1.schoolName);
//        System.out.println(student2.schoolName);
//        TechtorialStudent.setSchoolAddress("2200 East Devon Avenue");
//        System.out.println(student1.schoolAddress);
//        System.out.println(student2.schoolAddress);
//
//        //It doesn't matter how we initialize the static
//        // variables when we initialize it, the variable is going to be same for every object
//        setStaticVariables("Techtorial", "2200 E Devon Avenue");
//        TechtorialStudent student3= new TechtorialStudent();
//        //It doesn't matter how many object we create our address
//        // and school name is going to be common for every object.
//        System.out.println(student3.schoolAddress);
//
//    }
//    public static void setStaticVariables ( String schoolName, String address){
//        TechtorialStudent.setSchoolAddress(address);
//        TechtorialStudent.setSchoolName(schoolName);
//    }
//}
