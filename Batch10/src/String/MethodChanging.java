package String;

public class MethodChanging {

    public static void main(String[] args) {

        String text="Just do it  ";
        int x=text.replace('a','*').trim().replace("e","**").toUpperCase().indexOf('*');

        System.out.println(x);//number index

        char ch=text.replace('a','*').trim().replace("e","**").toUpperCase().charAt(0);

        String st=text.replace('a','*').trim().replace("e","**").toUpperCase();
        System.out.println(ch);//char
        System.out.println(st);//string
    }
}
