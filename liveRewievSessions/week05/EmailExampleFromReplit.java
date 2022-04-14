package week05;

import java.util.Locale;
import java.util.Scanner;

public class EmailExampleFromReplit {


    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("Please enter valid email:craig_frederighi@gmail.com");
        String email= input.next();

        int indexOf_=email.indexOf("_");
        int indexOfAtSign=email.indexOf("@");
        int indexOfDot=email.indexOf(".");

        String firstName=email.substring(0,indexOf_);
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("firstName="+firstName);
        
        
        String lastname=email.substring(indexOf_+1,indexOfAtSign);
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
        System.out.println("lastname = " + lastname);

        String domainname=email.substring(indexOfAtSign+1,indexOfDot);
        System.out.println("domainname = " + domainname);

        

    }
}
