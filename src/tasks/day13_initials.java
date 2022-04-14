package tasks;

import java.util.Locale;
import java.util.Scanner;

public class day13_initials {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName= scan.nextLine();

        System.out.println("Enter last name");
        String lastName=scan.nextLine();

        scan.close();

        char f=firstName.toUpperCase().charAt(0);
        char l=lastName.toUpperCase().charAt(0);

     String result=f+"."+l;
        System.out.println(result);


    }
}
