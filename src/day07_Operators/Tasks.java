package day07_Operators;

public class Tasks {
    public static void main(String[] args) {
        /*

1. write a program that can swipe two variables' value by using a
temporary variable
    Ex:
        if a= 10, b=15
    output:
        a = 15
        b = 10



         */
        int a=10, b=15;
        System.out.println("a = " + b);
        System.out.println("b = " + a);

        /*
       2. create a class named LeapYear, and write a program that can
identify if the given year is leap Year, print true if it's leap year,
otherwise print false
        Ex:
             if  year = 2020
            output:
                2020 is leap year: true
Hint: if the number of year can be evenly divisible by 4 (with
remainder of zero), it's leap year
        exp.int creditscore=745;
        boolean isEligibleForLoan=creditscore>=720;

         */
          int year=2020;

         boolean isLeapYear=year%4==0;
        System.out.println(year+( " is leap year:")+isLeapYear);





        System.out.println("----------------");

        /*
        3. Create a class called SalaryCalculator.java
3.1 declare the following variables:
hourlyRate, weeklyHours,
stateTaxRate, federalTaxRate
3.2 use the given info in above variables to
calculate the followings:
1. salaryBeforeTax
2. stateTax
3. federalTax
4. totalTax
5. salaryAfterTax
Hint: salaryBeforeTax =
hourlyRate * weeklyHour * 52
3.3 use print statement to print each of the
above
Ex:
   hourlyRate = $50
   weeklyHours = 45
   stateTaxRate = 6
(given as percentage, you need to convert to decimal)
   federalTaxRate = 26
(given as percentage, you need to convert to decimal)
    output:
    Gross pay is: $117000
    Federal tax is: $30420
    State tax is: $7020



         */


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
        System.out.println(lastName+(",")+name+"Address:"+street+(",")+city+(",")+state+zipCode+("Contacs:work phone number-"+phoneNumber+(",")+("personel phone number-"+personelNumber+(","+("email:")+email+(" Age:")+age+(" Height:")+height+(" Weight:")+weight+("pounds Married?:")))));

    }

}
