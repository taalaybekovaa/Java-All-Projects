package RecapJavaWithAhmet.ObjectMethod;

public class InstanceAndStatic {

    static {
        System.out.println(" I am a static block ");
    }
    static {
        System.out.println("I am a second static block");
    }


    //What is the possible interview questions:
    //1) What is the difference between Instance and static block
    //The main difference between them all about calling static which belongs to class one time and all the way top
    //Instance block belongs object and it will go after static
    // as many as objects you created


    public static void main(String[] args) {
InstanceAndStatic obje= new InstanceAndStatic();
InstanceAndStatic obje3= new InstanceAndStatic();



        }
    }
