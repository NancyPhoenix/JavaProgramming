package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        //assignment:=
        // add assignment:+
        
        double num1=2.5;

        System.out.println("num1 = " + num1);

        num1 +=5.5;

        System.out.println("num1 = " + num1);


        double availableBalance=1000.50;
        //deposit 300$

        availableBalance +=300;

        System.out.println("availableBalance = " + availableBalance);//1300.5


       // salary-2;//salary=-2
        
        double num2=25000.0;
        num2 /=2;
        System.out.println("num2 = " + num2);

        System.out.println("-------------------------");
        
        int y =300;
        
        y%=16;
        System.out.println("y = " + y);

        System.out.println("-----------------------------------");

        int balance=3500;
        balance %=153;

        System.out.println("balance = " + balance);

        
        



    }
}
