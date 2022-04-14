package week02;

import java.util.Scanner;

public class UserInputIntro {


    public static void main(String[] args) {


        String name="Nancy";


        System.out.println("Output");

        Scanner input = new Scanner(System.in);//you dont see anything
        System.out.println("Put your name : ");

        name=input.next(); //reads the data from console and assigns the value to my variable

        System.out.println("name = " + name);





    }
}
