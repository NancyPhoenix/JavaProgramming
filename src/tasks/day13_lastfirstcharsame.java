package tasks;

import java.util.Scanner;

public class day13_lastfirstcharsame {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter a word");
        String word=scan.next();

        scan.close();

        char firstChar=word.charAt(0);
        char lastChar=word.charAt(word.length()-1);

        if (firstChar==lastChar){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }


    }
}
