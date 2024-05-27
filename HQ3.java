/*
Create a class Bank with two instance variables: bankNname, depositAamount and a class variable totalAamount. 
Defined three member methods: setBankName() to set the bank name, setAmount() to set the deposit amount, and showData() for displaying the bank name and deposit amount. 
A person visited 5 different banks and deposite money.
Create 5 array object of class Bank set the bank name and deposit amount (the minimum deposit amount is 1000) using member methods setBankName() and setAmount(). 
Call the showData() method to display the information with totalAmount deposited by the person. 
Also, design a method that displays the bank name where the person deposits the minimum amount.
*/

class Bank{
    String bankName;
    int depositAmount;
    static int totalAmount;
    void setBankName(String bankName){
        this.bankName=bankName;
    }
    void setAmount(int depositAmount){
        if (depositAmount>=1000){
            this.depositAmount=depositAmount;
            totalAmount+=depositAmount;
        }else {
            System.out.println("Minimum deposit amount is 1000.");
        }
    }
    void showData(){
        System.out.println("Bank name: "+bankName);
        System.out.println("Deposit amount: "+depositAmount);
    }
    public static void displayTotalAmt(){
        System.out.println("Total amount deposited: "+totalAmount);
    }
    static void minAmt(Bank b[]){
        String minBankname="";
        int minDeposit=Integer.MAX_VALUE;
        for (int i=0; i<5;i++){
            if (b[i].depositAmount<minDeposit){
                minDeposit=b[i].depositAmount;
                minBankname=b[i].bankName;
            }
        }
        System.out.println("Bank where he deposited minimum amount: "+minBankname);
    }
}

public class HQ3 {
    public static void main(String[] args) {
        Bank b[] = new Bank[5];
        for (int i=0; i<5; i++){
            b[i]=new Bank();
        }
        b[0].setBankName("HDFC");
        b[0].setAmount(890);
        b[1].setBankName("AXIS");
        b[1].setAmount(900);
        b[2].setBankName("ICICI");
        b[2].setAmount(1500);
        b[3].setBankName("OGB");
        b[3].setAmount(2390);
        b[4].setBankName("PNB");
        b[4].setAmount(6570);

        for (int i=0; i<5; i++){
            b[i].showData();
        }
        System.out.println("Total amount deposited: "+Bank.totalAmount);
        Bank.minAmt(b);
    }
}
