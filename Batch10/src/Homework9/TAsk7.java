    package Homework9;

    import java.util.Arrays;

    public class TAsk7 {

           /* Create an int array with 6 elements and print a
            multiplication table for each element from an array.*/

            public static void main (String[]args){

                int[][] multipleTable = new int[10][6];
                multipleTable[1][0] = 1;
                multipleTable[1][1] = 2;
                multipleTable[1][2] = 3;
                multipleTable[1][3] = 4;
                multipleTable[1][4] = 5;
                multipleTable[1][5] = 6;

                int row = 1;
                int column = 1;

                for (int a = 0; a < multipleTable.length; a++) {

                    for (int b = 0; b < multipleTable[a].length; b++) {
                        multipleTable[a][b] = row * column;
                        column = column + 1;
                    }
                    row = row + 1;
                    column = 1;
                }
                for (int a = 0; a < multipleTable.length; a++) {

                    for (int b = 0; b < multipleTable[a].length; b++) {
                        System.out.print(" " + multipleTable[a][b] + "\t| ");
                    }
                    System.out.println("\n");
                }
            }
        }
