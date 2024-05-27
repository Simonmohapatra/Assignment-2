/*
Design a package that contains two classes Student & Test. 
The Student class has data members as name, roll and instance methods inputDetails() & showDetails().
Similarly the Test class has data members as mark1, mark2 and instance methods inputDetails(), showDetails(), Student is extended by Test. 
Another package carry interface Sports with 2 attributes score1, score2. Find grand total mark & score in another class.
*/

//Create two packages
//Package-1 (q_8pack1) contains - Student.java and Test.java

//Package-2 (q_8pack2) contains - Sports.java and result.java

//Package-1
package q_8pack1;
import java.util.Scanner;
class Student{
    String name;
    int roll;
    public void inputDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter student name: ");
        name= sc.nextLine();
        System.out.println("Enter roll no: ");
        roll=sc.nextInt();
    }
    public void showDetails(){
        System.out.println("Name: "+name+", Roll no: "+roll);
    }
}
public class Test extends Student{
    public double mark1, mark2;
    public void inputDetails(){
        super.inputDetails();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter mark1: ");
        mark1=sc.nextDouble();
        System.out.println("Enter mark2: ");
        mark2=sc.nextDouble();
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Mark1: "+mark1+", Mark2: "+mark2);
    }
}

//Package-2
package q_8pack2;
import q_8pack1.*;
public interface Sports{
    int score1=90;
    int score2=80;
}

class result extends Test implements Sports{
    public static void main(String[] args) {
        Test t1= new Test();
        t1.inputDetails();
        t1.showDetails();
        System.out.println("Score1: "+score1+" "+"Score2: "+score2);
        double grandtotal =t1.mark1 + t1.mark2 +Sports.score1 +Sports.score2;
        System.out.println("Grandtotal mark: "+grandtotal);
    }
}
