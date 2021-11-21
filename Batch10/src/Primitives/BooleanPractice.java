package Primitives;

public class BooleanPractice {//We use if we would like understand if it pass or not, true or false
    // for a boolean data types you can only give value of true or value
    public static void main(String[] args) {
        boolean isLighton=true;
        boolean isBreakTime;

        isBreakTime=isLighton;

        System.out.println(isLighton);
        System.out.println(isBreakTime);

        int num=6;
        System.out.println(num);

        int num1 =num; //We can give the same value but not the same name


        System.out.println(num1);
        boolean isClear = false;//Here we can add only two of the options-true or false

        System.out.println(isClear);
        //System.out.println(isBreakTime+isClear);//it will not compile
        System.out.println("!!!!!"+ isBreakTime+isClear);


        int i1=5;
        int i2=5;

        //is i1 equals to i2? yes--> true i1==i2 --> true
        //is i1 equals to i3? no--> false i1==i3 --> false

        boolean isi1EqualsToi2=i1==i2;
        System.out.println(isi1EqualsToi2);

        boolean b1=true;
        boolean bl1= true;
        //boolean b2=b1+b2; this is not possible




    }
}
