/*
Define a base class Person with instance variable name, age. The instance variables
are initialized through constructors. The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance
variables are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double).
Another instance method of Employee class is empDisplay() to display the information
of employee details.
*/

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class Employee extends Person{
    int Eid;
    double salary;
    Employee(String name, int age, int Eid, double salary){
        super(name,age);
        this.Eid=Eid;
        this.salary=salary;
    }
    void empDisplay(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Employee id: "+Eid);
        System.out.println("Salary: "+salary);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Employee e1= new Employee("Simon",18,40,56000000.0);
        Employee e2= new Employee("Subham",15,34,56789000.0);
        e1.empDisplay();
        e2.empDisplay();
    }
}
