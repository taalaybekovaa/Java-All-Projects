package Primitives;

public class UnaryOperators {
    public static void main (String[]args) {

        int studentNumber = 25;
        studentNumber = studentNumber + 1;
        studentNumber += 1;

        studentNumber++;
        System.out.println(studentNumber);
        ++studentNumber;
        System.out.println(studentNumber);

        studentNumber--;
        System.out.println(studentNumber);

        --studentNumber;
        System.out.println(studentNumber);

        studentNumber--;studentNumber--;studentNumber--;//
        System.out.println(studentNumber);//24

        studentNumber++;
        studentNumber--;
        System.out.println(studentNumber++);//it shows 24, but increases will appear after we print out
        System.out.println(studentNumber);//hows 25

        System.out.println(++studentNumber);//it shows 26, increases first and then print out
        //incraesing the value before variable is clled pre-increment --> ++studentNumber

        System.out.println(studentNumber--);//-->show 26, decrease by 1, 25
        studentNumber--; //24
        --studentNumber;//23
        System.out.println(--studentNumber);//decrease first 22, shows 22
        System.out.println(studentNumber);//print 22

        int a=studentNumber++ +studentNumber++ +5;
        a--;
        a=studentNumber;//reassigned back //a=24
        System.out.println(a--);//shows 24,a =23;



    }
}
