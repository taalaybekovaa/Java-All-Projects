package Mentoring.IntervievQuestions;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class removeDuplicatesfromArray {

    public static void main(String[] args) {

        List<String> al = new ArrayList<String>();
        String[] months={"Jan","Feb","Mar","Apr","Jan","Mar","May","May"};
        for(int i=0;i<months.length;i++){
            for(int j=1;j<months.length;j++){
                if(months[i].equalsIgnoreCase(months[j])){
                    if(!al.contains(months[i])){
                        al.add(months[i]);
                    }
                    System.out.println();
                }
            }
        }

    }
    /*

     */


}
