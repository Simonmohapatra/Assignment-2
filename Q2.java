/*
Define a class called Complex with instance variables real, imag and instance methods
 void setData(),
 void display(),
 public Complex add(Complex, Complex)
Write the main method in a separate class to implement the addition of two complex
number with the given method signature as above.
*/

import java.util.Scanner;
class Complex{
    double real;
    double imag;
    void setData(double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    void display(){
        System.out.println(real+" + "+imag+"i");
    }
    public Complex add(Complex c1, Complex c2){
        Complex sum = new Complex();
        sum.real= c1.real + c2.real;
        sum.imag= c1.imag + c2.imag;
        return sum;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r,i;
        Complex c1= new Complex();
        System.out.println("Enter real and imaginary part of first number: ");
        r= sc.nextDouble();
        i= sc.nextDouble();
        c1.setData(r,i);
        System.out.println("First complex no: ");
        c1.display();

        Complex c2= new Complex();
        System.out.println("Enter real and imaginary part of second number: ");
        r= sc.nextDouble();
        i= sc.nextDouble();
        c2.setData(r,i);
        System.out.println("Second complex no: ");
        c2.display();

        Complex sum= new Complex();
        sum=sum.add(c1,c2);
        System.out.println("Sum of the two complex numbers is: ");
        sum.display();
    }
}
