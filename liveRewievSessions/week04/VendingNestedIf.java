package week04;

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "drink";
        String drinkItem = "coffee";
        String snackItem = "chips";

        if (selection == "drink") {
            System.out.println("drink option is selected");
            if (drinkItem == "tea") {
                System.out.println("Tea item selected");
            } else if (drinkItem == "Coffee") ;
            {
                System.out.println("Coffee item selected");
            }


        } else if (selection == "snack") {
            System.out.println("Snack option is selected");
            if (snackItem == "chips") {
                System.out.println("chips is selected");
            } else if (snackItem == "candy") {
                System.out.println("candy is selected");
            }
        } else {
            System.err.println("INVALID ENTRY");
        }


        if (false)
            System.out.println("Hello");
            System.out.println("Running");//always use curly braces

    }


}
