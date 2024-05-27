/*
A point in the x-y plane is represented by its x-coordinate and ycoordinate. 
Design a class, PointType in Java, that can store and process a point in the x-y plane. 
You should then perform operations on the point, such as showing the point, setting the coordinates of the point, 
printing the coordinates of the point, returning the x-coordinate, and returning the y- coordinate. Every circle has a centre and a radius.
Given the radius, we can determine the circle’s area and circumference.
Given the centre, we can determine its position in the x-y plane. 
The centre of a circle is a point in the x-y plane. 
Design a class, CircleType that can store the radius and centre of the circle. 
Because the center is a point in the x-y plane and you designed the class to capture the properties of a point from PointType class. 
You must derive the class CircleType from the class PointType. 
You should be able to perform the usual operations on a circle, such as setting the radius, printing the
radius, calculating and printing the area and circumference, and carrying out the usual operations on the center.
*/

class PointType{
    double x;
    double y;
    PointType(double x, double y){
        this.x=x;
        this.y=y;
    }
    void setCoordinates(double x, double y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println("X-Coordinate: "+x);
        System.out.println("Y-Coordinate: "+y);
    }
}
class CircleType extends PointType{
    double radius;
    CircleType(double x, double y, double radius){
        super(x,y);
        this.radius=radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    void displayRadius(){
        System.out.println("Radius: "+radius);
    }
    void displayCenter(){
        System.out.println("Center: "+x+","+y);
    }
    double getArea(){
        return Math.PI*radius*radius;
    }
    double getCircumference(){
        return 2*Math.PI*radius;
    }
}

public class HQ5{
    public static void main(String[] args) {
        CircleType c1= new CircleType(4.0,5.0,2.0);
        c1.displayCenter();

        c1.setCoordinates(5,6);
        System.out.println("New center coordinates: ");
        c1.displayCenter();

        c1.displayRadius();
        System.out.println("New Radius: ");
        c1.setRadius(6);
        c1.displayRadius();

        System.out.println("Area: "+c1.getArea());
        System.out.println("Circumference: "+c1.getCircumference());
    }
}
