package tasks;

import java.util.Scanner;

public class day13_char {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        scan.close();

        char firstChar=sentence.charAt(0);
        char lastChar=sentence.charAt(sentence.length()-1);

        String result=firstChar+""+lastChar;
        System.out.println(result);

    }



}
