/*
Define a class Deposit. The instance variable of the class Deposit are mentioned
below.
Instance Variable     Data Type
Principal              Long
Time                   Integer
Rate                   Double
TotalAmt               Double
Initialize the instance variables Principal, Time, rate through constructors. Constructors are overloaded with the following prototypes.
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are
(i) display ( ): to display the value of instance variables,
(ii) calcAmt( ): to calculate the total amount.
totalAamt = Principal + (PrincipalÖrateÖTime)/100;
*/

class Deposit{
    long principal;
    int time;
    double rate;
    double totalAmt;

    Deposit(){
        principal=100;
        time=1;
        rate=5.7;
    }
    Deposit(long principal, int time, double rate){
        this.principal=principal;
        this.time=time;
        this.rate=rate;
    }
    Deposit(long principal, int time){
        this.principal=principal;
        this.time=time;
    }
    Deposit(long principal, double rate){
        this.principal=principal;
        this.rate=rate;
    }
    void display(){
        System.out.println("Principal: "+principal);
        System.out.println("Time: "+time);
        System.out.println("Rate: "+rate);
    }
    double calcAmt(){
        System.out.print("The total amount is: ");
        totalAmt= principal+(principal*rate*time)/100;
        return totalAmt;
    }
}

public class Q4{
    public static void main(String[] args) {
	Deposit d1= new Deposit();
        d1.display();
        System.out.println(d1.calcAmt());

        Deposit d2= new Deposit(1000,2,6);
        d2.display();
        System.out.println(d2.calcAmt());

        Deposit d3= new Deposit(2000,2);
        d3.display();
        System.out.println(d3.calcAmt());

        Deposit d4= new Deposit(1500,5.0);
        d4.display();
        System.out.println(d4.calcAmt());
    }
}
