package tasks;

import java.util.Scanner;

public class day13_last3char {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a string:");
        String word=scan.nextLine();
        scan.close();

       int lenght=word.length();
        String result="";

        if (lenght==0){
            result="Empty";
        }else if (lenght>3){
        int lastIndex=word.length()-1;
            result=""+word.charAt(lenght-3)+word.charAt(lenght-2)+word.charAt(lenght-1);
        }else{
            result=word;
        }
        System.out.println(result);


    }
}
