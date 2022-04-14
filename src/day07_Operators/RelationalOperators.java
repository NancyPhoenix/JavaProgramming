package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        //>/>=/</<=
        
        boolean result1=200>40;//false
        System.out.println("result1 = " + result1);
        
        boolean result2=300>= 150;//true
        System.out.println("result2 = " + result2);
        
        boolean result3=100>=100;//true
        System.out.println("result3 = " + result3);
        
        
        boolean result4=300>=500;//false
        System.out.println("result4 = " + result4);
        
        
        //vredit score of 720
        int creditscore=745;
        boolean isEligibleForLoan=creditscore>=720;
        
        boolean result5=100<120;
        System.out.println("result5 = " + result5);
        
        int score= 50;
        boolean hasfailed = score<=59;
        System.out.println("hasfailed = " + hasfailed);
        
        boolean result7=45<=60;
        System.out.println("result7 = " + result7);
        
        int x=100;
        int y=200;
        
        boolean equal = x==y;

        System.out.println("equal = " + equal);

        boolean result8='A'=='a';
        System.out.println("result8 = " + result8);
        boolean result9="Java"=="Java";
        System.out.println("result9 = " + result9);
        
        boolean result11=100!=300;
        System.out.println("result11 = " + result11);
        boolean result12=300!=300;
        System.out.println("result12 = " + result12);
        System.out.println("--------");
        

        long a=3000L;
        double b=(float)a;
        int c=(short)b;
        System.out.println(c%1000);
        



        
    }
}
