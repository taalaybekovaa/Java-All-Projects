package Primitives;

public class LogicalOperatorsPractice {

    public static void main(String[] args) {

        //You need to pass a course if you attend 95 percent or more of the class or you get more
        // than 70 as a passing score out of 100;
        int Score=60;
        int MyAttendance=80;

        int minScore=70;
        int attendance=95;

        boolean CanIPass=(Score>=minScore || MyAttendance>attendance);
        System.out.println(CanIPass);





    }
}
