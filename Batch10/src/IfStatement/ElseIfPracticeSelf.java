package IfStatement;

import java.util.Scanner;

public class ElseIfPracticeSelf {
    public static void main(String[] args) {

        /*
There is a course that user need to pass
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
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hi!Please provide first test scores as integer between 0 to 100 ");
        int score= scanner.nextInt();
        System.out.println("Hi!Please provide second test scores as integer between 0 to 100 ");
        int score2= scanner.nextInt();
        System.out.println("Hi!Please provide third test scores as integer between 0 to 100 ");
        int score3= scanner.nextInt();

        int averageOFScores=(score+score2+score3)/3;


        if (score>=90 && score<=100){
            System.out.println("Your average test score is" + " and letter grade is A'");
       }
        else if (score>=80 && score<=89){
            System.out.println("Your average test score is" +" and letter grade is B");
        }
        else if (score>=70 && score<=79){
            System.out.println("Your average test score is " +" and letter grade is C");
        }
        else if (score>=60 && score<=69){
            System.out.println("Youraverage test score is " +" and letter grade is D ");
        }else{
            System.out.println("You need to take this course again");
        }
        }
    }

//Why we are not  using if if if else statements, bs we need to create conditions depending on
// each other and want to pass give one outcome.We are not using the if if if else statemnts bc it' snot different conditions/
// not different conditions.If you are using if if if else statement it may give you more than one condition
