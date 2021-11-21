package Mentoring.IntervievQuestions;

import java.util.Arrays;

public class SwitchingWord {

    public static void main(String[] args) {

        //Switch the pairs

        String[] array = {"four", "flowers", "sun", "eleven", "cloud", "better", "git"};
        //String[] array3 = {"2", "1", "4", "3", "6", "5", "7"};


        for (int i = 0; i < array.length - 1; i++) {
            String temp = array[i];//to not disappear when you are switching
            array[i] = array[i + 1];
            array[i + 1] = temp;
            i++;
        }
        System.out.println(Arrays.toString(array));
        String[] array3 = {"2", "1", "4", "3", "6", "5", "7"};

            for (int j = 0; j > array3.length; j+=2) {
                String temp1 = array3[j];
                array3[j] = array3[j + 1];
                array3[j + 1] = temp1;

            }
        System.out.println(Arrays.toString(array3));
        }

    }


