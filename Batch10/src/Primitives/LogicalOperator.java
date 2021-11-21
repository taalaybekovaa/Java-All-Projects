package Primitives;

public class LogicalOperator {

    public static void main(String[] args) {

        int myAge=15;
        boolean myDress=true;

        int ageReq=21;
        boolean dressCode=true;
       // myAge>=ageReq && myDress==dressCode;//we have to put boolean
        boolean CanIAttend=myAge>=ageReq && myDress==dressCode;
        System.out.println(CanIAttend);
        myAge=21;
        boolean CanIAttend1=myAge>=ageReq && myDress==dressCode;
        System.out.println(CanIAttend1);

        //=============//

        int myNewAge=28;
        boolean myMoney=false;
        int ageRequirements=18;
        boolean moneyReq=true;

        boolean canIGo=myNewAge>=ageRequirements || myMoney ==moneyReq;
        System.out.println(canIGo);

        canIGo=myNewAge>=ageRequirements|| myMoney ==moneyReq;
        System.out.println(canIGo);







    }
}
