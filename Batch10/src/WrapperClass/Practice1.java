package WrapperClass;

public class Practice1 {

    public static void main(String[] args) {

        byte b1= 2;
        Byte bt1=new Byte(b1);// if you store you in a object type you are able to accsess method
        System.out.println(bt1);

        short s1=4;
        Short sh1= new Short(s1);
        System.out.println(s1);
        short sh2=new Short((short) 5);
        System.out.println(sh2);

        Integer i1= new Integer(12);//bc Java pass everything like an integer
        System.out.println(i1);

        long l1=123;
        Long lg1= new Long(l1);
        Long lg2=new Long(123);
        System.out.println(lg1);

        Double db1= new Double(3.5);
        System.out.println(db1);

        Float fl1= new Float(2.5);
        System.out.println(fl1);

        Boolean bl1= new Boolean("True");
        System.out.println(bl1==true);

        Boolean bl2= new Boolean("True");
        System.out.println(bl2==true);

        Character ch1= new Character('R');
        System.out.println(ch1);
        char c ='T';
        Character ch2= new Character(c);
        Character ch3= new Character('1');
        //Character ch4= new Character(65); Compile time error it doesn't accept.It should be in single quotation
        // This data type waiting for single number if u pass 2 numbers os drom asci table its will give you compile time error
        System.out.println(ch3);

        //Autoboxing --> converting primitive data to Object type (Wrapper class);

        Integer i2= 25; // AutoBoxing
        Boolean b2=true; //AutoBoxing

        // Unboxing --> converting Wrapper class object to primitive data

        int a = new Integer(11);
        char c1= ch1; //UnBoxing
        Character ch4= ch3;
        System.out.println();

        double d2=db1;





    }
}
