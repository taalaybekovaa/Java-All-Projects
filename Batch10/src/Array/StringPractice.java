package Array;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {//-string array

      String [] studentsNames=new String[6];

      studentsNames[5]="Zolie";
      studentsNames[2]="Sorin";
      studentsNames[3]="Sorin";
      studentsNames[4]="Adel";

        System.out.println(Arrays.toString(studentsNames));
        studentsNames[4]="David";
        System.out.println(Arrays.toString(studentsNames));
        System.out.println(studentsNames.length);

        for(int i=0;i< studentsNames.length;i++){
            System.out.println("For loops elements-> "+studentsNames);
        }





    }
}
