package Loops;

public class continueBreakStatement {

    public static void main(String[] args) {
        OUTER:
        for(int number=0; number<15; number++){
          //  if(number==4){
             //   break;
          //  }
            if(number>=1 && number<=3){
                continue;
            }

            for (char ch='A'; ch<'H'; ch++){

                if(number==10){
                    break OUTER;//Word outers is only for labeling purpose
                    // break statemnt will stop execution for curtain condition
                }
                if(ch=='C' || ch=='D'){// id going to skip thei sletters
                    continue;// continue statement will skip those specific conditions
                }
                System.out.print(number);
                System.out.println(ch);
            }
            System.out.println();
        }

    }
}
