package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
      /*
      integer/integer===>integer
      decimal/decimal====>decimal
      integer/decimal====>decimal
      decimal/decimal====>decimal

       */

        System.out.println(10+20);//addition
        System.out.println(100-50);//subtraction
        System.out.println(10*6);//multiplication
        System.out.println(10.0/4);//sure be use decimal---
        System.out.println();

        int a =100;
        double b = a/6;//16
        System.out.println(b);


        double c=(double)a/6;
        System.out.println(c);

        System.out.println(100d);

      /*
      Addition:+
      Subtract:-
      Multiplication:*
      Division:/
      Remainder:%

       */


    }
}
