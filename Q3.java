/*
In a super market each product is having minimum details like prodId, price, quantity
that is used during the biling process. Keeping this in mind prepare a class named as
Product having the member variables
 prodId, price, quantity
 a static variable totalPrice
Initialize the value of product through parameterized constructor. It consists of a
display() method to display the value of instance variables. A person went to market
and purchase 5 different products. Using the above mentioned class, display the details
of products that the person has purchased. Also, determine how much total amount
the person will pay for the purchase of 5 products.
*/

class Product{
    int prodId;
    double price;
    int quantity;
    static double totalPrice;

    Product(int prodId, double price, int quantity){
        this.prodId=prodId;
        this.price=price;
        this.quantity=quantity;
    }
    void display(){
        System.out.println("Product id: "+prodId);
        System.out.println("Product price: "+price);
        System.out.println("Product quantity: "+quantity);
    }
    static double total_Price(Product[] p){
        for (int i=0; i<5; i++){
            totalPrice+=p[i].price*p[i].quantity;
        }
        return totalPrice;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Product [] p= new Product[5];
        p[0]= new Product(1001, 200.0,1);
        p[1]= new Product(1002, 300.0,2);
        p[2]= new Product(1003, 299.78,3);
        p[3]= new Product(1004, 48.88,4);
        p[4]= new Product(1005, 687.67,5);

        for (int i=0; i<5; i++){
            p[i].display();
        }
        double totalPrice= Product.total_Price(p);
        System.out.println("Total price: "+totalPrice);
    }
}
