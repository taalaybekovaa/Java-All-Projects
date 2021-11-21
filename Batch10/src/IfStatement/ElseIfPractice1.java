package IfStatement;

import java.util.Scanner;

public class ElseIfPractice1 {

    public static void main(String[] args) {


        /*There is a course that user need to pass
        User got three test scores for this course
        To be able print/show users Letter grade
        -Ask User to provide those three test scores as integer between 0 to 100
                -find the average of the provided test scores
                -Based on the average score
        - if the average is 90 to 100 --> print 'Your average test score is <average> and letter grade is A'
                - if the average is 80 to 89 --> print 'Your average test score is <average> and letter grade is B'
                - if the average is 70 to 79 --> print 'Your average test score is <average> and letter grade is C'
                - if the average is 60 to 69 --> print 'Your average test score is <average> and letter grade is D'
                - if the average is less than 60 --> 'You need to take this course again!!'
                */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your score as an integer number between 0 to 100");
        int result1= scan.nextInt();
        System.out.println("Please provide your second score as integer number between 0 to 100 ");
        int result2=scan.nextInt();
        System.out.println("Please enter your third score as an integer number from 0 to 100");
        int result3 = scan.nextInt();

        int averageScore=(result1+result2+result3)/3;

        if (averageScore>=90 && averageScore<=100){
            System.out.println("Your average test score is " + averageScore+" and letter grade is 'A' ");
        }else if(averageScore>=80 && averageScore<=89){
            System.out.println("Your average test score is "+ averageScore+" and letter grade is 'B' ");
        }else if(averageScore>=70 && averageScore<=79){
            System.out.println("Your average score is "+ averageScore+ " and letter grade is 'C' ");
        }else if (averageScore>=60 && averageScore<=69){
            System.out.println(" Your average score is "+ averageScore+"an letter grade is  'D' ");
        }else{
            System.out.println(" Your average is "+averageScore+" need to retake the exam ");
        }
        }
        }


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter trhree test scores as integer between 0 to 100");
        int score = scanner.nextInt();
        System.out.println("Please enter trhree test scores as integer between 0 to 100");//This
        // one just to inform users again that they need to enput one more digit
        int score1 = scanner.nextInt();//This
        // one just to inform users again that they need to enput one more digit
        System.out.println("Please enter trhree test scores as integer between 0 to 100");//
        int score2 = scanner.nextInt();

        int averageOfSctores = (score + score1 + score2) / 3;
        System.out.println(averageOfSctores);

        if (score >= 90 && score <= 100) {
            System.out.println("Your average test score is <average> and letter grade is A");


        } else if (score >= 80 && score <= 89) {
            System.out.println("Your average test score is <average> and letter grade is B");

        } else if (score >= 70 && score <= 79) {
            System.out.println("Your average test score is <average> and letter grade is C");

        } else if (score >= 60 && score <= 69) {
            System.out.println("Your average test score is <average> and letter grade is D");
        } else {
            System.out.println("You need to take this course again!");

            // Here we are using esle else esle to compare one condition. We need just one statement in output

/* //Why we are not  using if if if else statements, bs we need to create conditions depending on
// each other and want to pass give one outcome.We are not using the if if if else statemnts bc it' snot different conditions/
// not different conditions.If you are using if if if else statement it may give you more than one condition*/

