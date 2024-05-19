/* 
Define a class Person with two instance variables:
 name and age
and two member methods:
 setData(): set the details of the person.
 displayData(): display the details of the person.
Now, create two objects of class person and initialize one object value directly (by
using the dot(.) operator name: “Rohan” and age: 20 ). Accept your name and age
through the keyboard and set them to another object using the setData() method.
Now display both the member variables using the displayData() method. Also, check
who is younger.
*/

import java.util.Scanner;
class Person{
    String name;
    int age;
    void setData(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Rohan";
        p1.age=20;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and age: ");
        String n=sc.nextLine();
        int a = sc.nextInt();
        Person p2= new Person();
        p2.setData(n,a);

        System.out.println("Details of person 1: ");
        p1.displayData();
        System.out.println("Details of person 2: ");
        p2.displayData();

        if (p2.age>p1.age){
            System.out.println(p1.name+" is younger than "+p2.name);
        }
        else if(p2.age<p1.age){
            System.out.println(p2.name+" is younger than "+p1.name);
        }
        else {
            System.out.println("Both have same age.");
        }
    }
}
        
