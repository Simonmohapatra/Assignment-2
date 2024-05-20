/*
Create an abstract class Marks with three instance variables (markICP, markDSA,and percentage) and an abstract method getPercentage(). 
Create two classes: CSE with instance variable algoDesign, and NonCSE with instance variable enggMechanics. 
Both classes inherit the abstract class Marks and override the abstract method getPercentage(). 
The constructor of class CSE takes the marks in three subjects (markICP, markDSA, and algoDesign) as its parameters, 
and the constructor of class NonCSE takes the marks in three subjects (markICP, markDSA, and enggMechanics) as its parameters. 
Create an object for each of the two classes and print the percentage of marks for both students.
*/

abstract class Marks{
    int markICP;
    int markDSA;
    double percentage;
    public abstract void getPercentage();
}

class CSE extends Marks{
    int algoDesign;
    CSE(int markICP, int markDSA, int algoDesign){
        this.markICP=markICP;
        this.markDSA=markDSA;
        this.algoDesign=algoDesign;
    }
    public void getPercentage(){
        percentage= ((markICP+markDSA+algoDesign)/300.0)*100;
        System.out.println("Percentage of mark for CSE student: "+percentage);
    }
}

class NonCSE extends Marks{
    int enggMechanics;
    NonCSE(int markICP, int markDSA, int enggMechanics){
        this.markICP=markICP;
        this.markDSA=markDSA;
        this.enggMechanics=enggMechanics;
    }
    public void getPercentage(){
        percentage= ((markICP+markDSA+enggMechanics)/300.0)*100;
        System.out.println("Percentage of mark for non- CSE student: "+percentage);
    }
}

public class Q6{
    public static void main(String[] args) {
        CSE studentCSE = new CSE(85, 90, 88);
        NonCSE studentNonCSE= new NonCSE(75, 80, 78);
        studentCSE.getPercentage();
        studentNonCSE.getPercentage();
    }
}
