package week04;

public class AdaireApartments {

    public static void main(String[] args) {
        int numOfBedrooms=0;
        double startingPrice=0;


        switch (numOfBedrooms){
            case 0:
                System.out.println("You have selected studio apartment");
                startingPrice=1454.0;
                break;
            case 1:
                System.out.println("You have selected One Bedroom apartment");
                startingPrice=1725.0;
                break;
            case 2:
                System.out.println("You have selected Two Bedroom apartment");
                startingPrice=2899.0;
                break;
            default:
                System.out.println(numOfBedrooms+"bedroom apartment not available");

        }
        System.out.println("Starting price :$ "+startingPrice);






    }
}
