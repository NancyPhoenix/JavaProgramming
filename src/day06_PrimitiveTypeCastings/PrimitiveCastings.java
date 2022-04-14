package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        //implicit casting

        byte a=100;
        short b=a;

        System.out.println(a+":"+b);



     //explicit casting
        long j =1000000;
        short k =(short)j;

        System.out.println(j+":"+k);

        double d1=20.5;
        short s1= (short) d1;

        System.out.println(d1+":"+s1);



    }
}
