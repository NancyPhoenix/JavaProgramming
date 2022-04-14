package week04;

public class AmazonFreeShipping {

    public static void main(String[] args) {


       double  totalPrice= 25;
        if (totalPrice>=25){
            System.out.println("FREE SHIPPING ELIGIBLE Your Order Total : $ "+totalPrice);
        }else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING : $"+totalPrice);
        }

        System.out.println("Thanks for shopping for us");


    }

}
