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
        
