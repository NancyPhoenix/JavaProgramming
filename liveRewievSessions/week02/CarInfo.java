package week02;

public class CarInfo {

    public static void main(String[] args) {

        int year=2022;
        String make="BMW";
        String model="Z4";
        boolean transmission=true;
        String colour="grey";
        int millage=0;
        int price=75_000;


        System.out.println(year+" "+make+" "+model+"\nAutomatic transmission:"+transmission);
        System.out.println(colour+"|"+millage+"kilometers|"+price+"Euros");

        double priceInTl=price*15.5;

        double taxRate=1.80;

        double priceAfterTaxInTl=priceInTl+(priceInTl*taxRate);

        System.out.println("priceAfterTaxInTl = " + priceAfterTaxInTl);




    }
}
