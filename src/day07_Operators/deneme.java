package day07_Operators;

public class deneme {

    public static void main(String[] args) {


        String name="James";
        String lastName="May";
        String email="jamesmay@gmail.com";
        String street="7925 Jones branch Dr";
        String city="McLean";
        String state="VA";
        int zipCode=22102;
        long phoneNumber=7896542314l;
        long personelNumber=2406542314l;
        int age=34;
        double height=5.10;
        double weight=173.2;
        boolean married=true;

        System.out.println("Patient personel information Full name:");
        System.out.println(lastName+(",")+name+"Address:"+street+(",")+city+(",")+state+zipCode+("\nContacs:work phone number-"+phoneNumber+(",")+("\npersonel phone number-"+personelNumber+(","+("\nemail:")+email+(" Age:")+age+("\nHeight:")+height+(" Weight:")+weight+("pounds Married?:")+married))));
    }
}
