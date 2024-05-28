/* 
A sales person is paid commission based on the sales he makes as shown by the following table:
SALES                        COMMISSION
Under Rs. 100                2% of SALES
Rs 500 and under Rs 5000     5% of Sales
Rs 5000 and above            8% of sales
Write a class, Commission, which has:
An instance variable, sales; an appropriate constructor; and a method,getCommission() that returns the commission.
Now write a Demo class in Java to test the Commission class by reading a sale from the user, 
using it to create a Commission object after validating that the value is not negative. 
Finally, call the getcommission() method to get and print the commission.
If the sales are negative, your Demo class should print the message “Invalid Input”
  */

import java.util.Scanner;
class Commission{
    double sales, commission=0;
    Commission(double sales){
        this.sales=sales;
    }
    public double getCommission(){
        if (sales<0){
            System.out.println("Invaslid input: ");
            return 0;
        }
        else if (sales<100){
            commission+=0.2*sales;
        }
        else if (sales<5000) {
            commission+=0.5*sales;
        }
        else {
            commission+=0.8*sales;
        }
        return commission;
    }
}

public class HQ1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sale: ");
        double sale= sc.nextDouble();
        Commission c= new Commission(sale);
        double commission=c.getCommission();
        System.out.println("The commission is: "+commission);
    }
}
