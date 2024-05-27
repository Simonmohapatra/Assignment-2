/* 
Define an interface DetailInfo to declare methods display( ) & count( ). 
Another class Person contains a static data member maxcount, 
instance member name & method display( ) to display name of a person, 
count the no. of characters present in the name of the person.
*/

interface DetailInfo{
    void display();
    int count();
}
class Person implements DetailInfo{
    static int maxcount;
    String name;
    Person(String n){
        name=n;
    }
    public int count(){
        return name.length();
    }
    public void display(){
        System.out.println("Name: "+name+"\nNo of characters present in name: "+count());
    }
}

public class Q7 {
    public static void main(String[] args) {
        Person p= new Person("XYZ");
        p.display();
    }
}
