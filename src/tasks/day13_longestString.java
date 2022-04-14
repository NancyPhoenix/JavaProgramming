package tasks;

import java.util.Scanner;

public class day13_longestString {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first String of Text:");
        String str1=scan.nextLine();
        System.out.println("enter your second String of text:");
        String str2=scan.nextLine();

        scan.close();
        if (str1.length()>str2.length()){
            System.out.println(str1);
        }else if (str2.length()>str1.length()){
            System.out.println(str2);
        }else {
            System.out.println("Both have same lenght");
        }

    }
}