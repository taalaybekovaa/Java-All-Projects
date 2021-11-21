package Switch;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /* You are making call to a Company, they are three departments : It-1, HR-2, REP-3
        in the IT department: Raj, Alex, Jessi
        in the HR dep: Ana, Tima
        in the rep. dep:Jeramiah, John,David
        ask user which department they want to talk to
        after they choose department ask them :who do want to talk with?
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("You are making call to a Company, they are three departments : 1-It/2-HR/3-REP. Please enter the number of deparment");
        int department = scan.nextInt();

        switch (department) {

            case 1:
                System.out.println(" You entered IT department ");
                scan = new Scanner(System.in);// I don't need actually a scanner
                System.out.println(" With whom you would like to speak? 1- Raj, 2-Alex,3-Jessi");
                int name= scan.nextInt();
                switch(name){

                    case 1:
                        System.out.println(" You are connecting to Raj");
                        break;
                    case 2 :
                        System.out.println(" You are connecting to Alex");
                        break;
                    case 3:
                        System.out.println(" You are connecting to Jessi ");
                        break;
                    default:
                        System.out.println(" You entered invalid number");
                        break;
                } break;
                case 2:
                System.out.println("You entered HR departmemnt");
                scan=new Scanner(System.in);
                System.out.println("With whom you would like to speak?1-Ana/ 2-Tima");
                int number2= scan.nextInt();

                switch (number2){
                    case 1 :
                        System.out.println("You are connecting to Ana");
                        break;
                    case 2:
                        System.out.println(" You are connecting to Tima ");
                        break;
                    default:
                        System.out.println(" You entered invalid number ");
                        break;
                }break;
            case 3 :
                System.out.println(" You entered REP department");
                scan=new Scanner(System.in);
                System.out.println("With whom you would like to speak? 1-Jeramiah,2-John,3-David");
                int number3= scan.nextInt();

                switch(number3){
                    case 1:
                        System.out.println(" You are connecting to Jeramiah");
                        break;

                    case 2:
                        System.out.println(" You are connecting to John");
                        break;
                    case 3:
                        System.out.println(" You are connecting to David");
                        break;
                    default:
                        System.out.println(" You entered invalid number");
                        break;
                }break; default:
                System.out.println(" There is no such a department");

                }
        }
}



        /*Scanner input=new Scanner(System.in);
        System.out.println("Which department you want to talk to? 1-IT/2-HR/3-REP");

       int department= input.nextInt();
       switch (department){
           case 1: input=new Scanner(System.in);
               System.out.println("Who do you want talk with ?Raj, Alex, Jessi");
               String name= input.nextLine();
               switch(name.toLowerCase()){
                   case "raj":
                       System.out.println("Transferring to Raj");
                   break;
                   case "alex":
                       System.out.println("Transferring to Alex");
                       break;
                   case "Jessi":
                       System.out.println("Transferring to Jessi");
                       break;
                   default:
                       System.out.println("Invalid selection");break;
           }
           break;
           case 2: input=new Scanner(System.in);
               System.out.println("Who do you want talk with? Ana/Tina");
               String hrName= input.nextLine().toLowerCase().trim();
               switch (hrName){
                   case "ana":
                       System.out.println("Transferring to Ana");break;
                   case "tina":
                       System.out.println("Transferring to Tina");break;
                   default:
                       System.out.println("Invalid selection");break;

               }break;
         case 3:input=new Scanner(System.in);
        System.out.println("Who do you want talk with ?Jeremiah, John, David");
        String repName=input.nextLine().toUpperCase().trim();
        switch (repName){
            case "JEREMIAH":
                System.out.println("Transferring to Jeremiah");
                break;
            case "JOHN":
                System.out.println("Transferring to John");break;
            case "David":
                System.out.println("Transferring to David");break;
            default:
                System.out.println("Invalid selection ");break;

        }break;
           default:
               System.out.println("Invalid selection ");
               break;

       }

    }
}*/