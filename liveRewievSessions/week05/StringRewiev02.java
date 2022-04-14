package week05;

import java.util.Locale;

public class StringRewiev02 {

    public static void main(String[] args) {
        String message= "EU8 is Avesome!!";
        int count= message.length();
        System.out.println("how many characters: "+count);
        System.out.println(count==16);
        if (message.length()==16){
            System.out.println("happy testing");
        }


        System.out.println(message.toUpperCase());
        System.out.println("message after uppercase");
        System.out.println(message);

        String messageTWO=message.toUpperCase();
        System.out.println(messageTWO);

        String str="abc";
        str=str.trim();
        System.out.println(str);


        String str2= " abc cde ";
        str2=str2.replace(" ","");
        System.out.println(str2);

        String str3=" Eu8 Awesome ";
        str3 = str3.trim().replaceFirst(" ","");
        System.out.println(str3);

        String str4=" Eu8 Awesome ";
        str4=str4.trim().replaceFirst(" ","").toUpperCase().substring(3);
        System.out.println(str4);




    }

}
