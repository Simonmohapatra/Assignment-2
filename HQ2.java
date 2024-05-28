/*
Define a class called Book with instance variables BName, BEdition, BPrice. 
Use constructor to initialize the instance variables of the class.
Another instance method display ( ) to display the book information. 
A person purchase 5 different books. 
Display the book details which has the maximum price.
*/

import java.util.Scanner;
class Book{
    String BName;
    int BEdition;
    int BPrice;
    Book(String BName,int BEdition,int BPrice){
        this.BName=BName;
        this.BEdition=BEdition;
        this.BPrice=BPrice;
    }
    void display(){
        System.out.println("Book name: "+BName);
        System.out.println("Book edition: "+BEdition);
        System.out.println("Book price: "+BPrice);
    }
    int getPrice(){
        return this.BPrice;
    }
}

public class HQ2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Book b[]= new Book[5];
        b[0]=new Book("DSA",8,560);
        b[1]=new Book("Calculus",9,500);
        b[2]=new Book("IGT",5,960);
        b[3]=new Book("UPEM",4,760);
        b[4]=new Book("ITW",6,860);
        Book max=b[0];
        for (int i=0; i<5; i++){
            if (b[i].getPrice() > max.getPrice()){
                max=b[i];
            }
        }
        System.out.println("Book having price "+max.getPrice()+" has maximum price.");
    }
}
