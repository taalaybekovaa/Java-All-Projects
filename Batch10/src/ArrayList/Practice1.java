package ArrayList;

import Constructor.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {
        ArrayList list1 =new ArrayList();
        ArrayList list2 =new ArrayList(5);
        ArrayList list3 =new ArrayList(list1);

        ArrayList<Integer> list4=new ArrayList<>();
        ArrayList<Integer> list5=new ArrayList<>();
        ArrayList<Double> list6=new ArrayList< Double>();

        //add()
        list2.add(11);
        list2.add("element");
        list2.add(22);
        System.out.println(list2);
        list2.add(33);
        System.out.println(list2);
        list2.add(2,44);//[11, element, 44, 22, 33]
        System.out.println(list2);
        //=====Methods=======
        //size()
        int list2Size=  list2.size();
        System.out.println(list2Size);

        list2.add(5,66);//[11, element, 44, 22, 33, 66]
        System.out.println(list2);

        //list2.add(8,88);// Exception
        list2.get(3);
        System.out.println(list2.get(3));
        // System.out.println(list2.get(10)); run time exception


        //remove()
        list2.remove("white");
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);
        list2.remove("66");//if the element is not on the arrayList nothing happens/does not remove
        System.out.println(list2);
        list2.add(66);
        list2.remove((Object)66);//[11, 44, 22, 33, 66]
        System.out.println(list2);

        //addAll()  ==you can add a whole collection to the ArrayList
        list3.addAll(list2);
        System.out.println("list3>>>" +list3);//[11, 44, 22, 33, 66]
        list3.add(77);
        System.out.println(list3);//[11, 44, 22, 33, 66, 77]

        //removeAll() == you can remove a whole collection from an ArrayList /Collection

        list3.removeAll(list2);
        System.out.println(list3);

        list3.add(88);
        list3.add(100);
        System.out.println(list3);//[77, 88, 100]

        //set()
        list3.set(2,200);
        System.out.println(list3);
        list3.set(0,300);
        //you can use String methods
        System.out.println(list3.contains(88));
        list3.set(0,"xxxx");
        System.out.println(list3.get(0).toString().startsWith("x"));

        //clear()
        System.out.println(list3);
        list3.clear();
        System.out.println(list3);// clear everything
        System.out.println(list3.size());









    }
}
