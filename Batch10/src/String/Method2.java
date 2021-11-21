package String;

import java.awt.color.ColorSpace;

public class Method2 {

    public static void main(String[] args) {

      String name="Diana";
      //IndexOf
        System.out.println( name.indexOf('D'));//0
       //You can use only one letter
        System.out.println(name.indexOf("D"));//0 Can take also String value.It's belongs to String class
        System.out.println(name.indexOf("Di"));// 0 It will also compile
        // but the meaning is different.It will show just .
        // Because if you add more than 1 character it will match with 2 below and give 0
        System.out.println(name.indexOf("ana"));//2 it looks for matching sequence of provided chars and returns first matching char's index
        System.out.println("tina");//-1 There is no matching char sequence.You will always negative -1 no -2-3
        System.out.println(name.indexOf("k"));//-1 meaning is not error is means "There is no matching char sequence".

        name=name.concat("Bejan");//Now it's Diana Bejan because we reassigned it
        System.out.println(name.concat("Bejan"));//Diana Bejan
        System.out.println(name);//Bejan
        System.out.println(name.indexOf("a",3));
        //It will start looking for the chart starting from given index which is also included

        System.out.println(name.indexOf("B",name.indexOf(" ")));//,-is a second value//Arzu Beril Sen
        name="Arzu Beril Sen";
        System.out.println(name.indexOf("e",7));
        System.out.println(name.indexOf("e",name.indexOf(" ")+3));

       name.indexOf(2);//Values that you are giving inside of the method parenthse are called parameters
        //some methods take no parameters, some take single parameter or multiple parameters
        name.length();//no parameters
        name.charAt(3);//single parameters
        name.indexOf("e",4); //You can pass either one or two parameters by separating them with common





    }
}
