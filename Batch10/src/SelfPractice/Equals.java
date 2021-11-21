package SelfPractice;

public class Equals {
    public static void main(String[] args) {

        String str1="Tutorial GateWay";
        String str2="TUTORIAL GATEWAY";
        String str3=new String ("TUTORIAL Gateway");
        String str4=new String("Tutorial GATEWAY");
        String str5=new String ("Java Programming");

        boolean a=str1.equals(str2);
        boolean b=str3.equalsIgnoreCase(str4);

        boolean c=str2.equalsIgnoreCase(str4);
        boolean d=str1.equalsIgnoreCase(str3);

        boolean e=str1.equalsIgnoreCase(str5);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
