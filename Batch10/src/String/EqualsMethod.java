package String;

public class EqualsMethod {
    public static void main(String []args){
       String a="David";

       String b="David";

       String c=new String("David");

       String d= new String("David");

        System.out.println(a==b);//true
        System.out.println(a.equals(b));
        System.out.println(a==c);//false bc they are different objects
        System.out.println(a.equals(c));//true because equals comparing just value
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(a=="David");//true comparing the value bc its not a new object
        System.out.println(a==new String ("David"));
        System.out.println(c="David");//false

        String e=a;
        String f=c;
        System.out.println(e==b);//true
        System.out.println(f.equals(d));//true bc we compare the values


    }
}
