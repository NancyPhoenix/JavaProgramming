package day23_CustomMethods_Void;

import java.util.Locale;

public class task {

    public static void main(String[] args) {
        oddNumber(16,56);
        System.out.println();
        System.out.println("-----------------------");
        eligibleToBuy(45);
        System.out.println("------------------------");
        areaOfSquare(25);
        System.out.println("--------------------------");
        convertDollarToLira(100);
        System.out.println("---------------------------");
        printEachChar("nancy");
        System.out.println("----------------------------");
        int[]numbers={1,2,3};
        printEachElement(numbers);
        System.out.println("----------------------------");
        fullName("cydeo","schOol");
    }
    public static void oddNumber(int startNum,int endNum){
        for (int i = startNum; i <=endNum ; i++) {
           if (i%2==1){
               System.out.print(  i+" ");
           }
        }

    }


    public static void eligibleToBuy(int age){
        if (age<21){
            System.out.println("Not Eligible");
        }else{
            System.out.println("Eligible");
        }
    }

    public static void areaOfSquare(int sideLength){
        int area = sideLength*sideLength ;
        System.out.println("area = " + area);

    }

    public static void convertDollarToLira(int dollarAmount){
        int lira=dollarAmount*15;
        System.out.println(dollarAmount +" dollar = " + lira+" lira");
    }

    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    public static void printEachElement(int []numbers){
      String result="";

        for (int each:numbers) {
            result+=each;


        }

        System.out.println("element are"+ result);
    }

    public static void fullName(String firstName,String lastName){
        String fullName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+" "+
                lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("fullName = " + fullName);
    }



}








/*
1. create a method that can print odd numbers between 1~100 in a
same line saperated by space

3. create a method that can check if a person is eligible to buy
alcohol

7. create a method that can calculate the area of a square

13. create a method named printEachChar that can print each
character of a string

14. create a method named printEachElement that can print each
elements of an integer array
16.  write a method that can print out the full name of a person in
regular format
ex:
fullName("cYdEo", "SCHOOL");
output:
"Cydeo School"


 */