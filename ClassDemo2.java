//Create a class Circle with radius. Create an object and calculate area and circumference.
import java.util.*;
class Circle{

    void circle(double radius) {
       double pi=3.14;
       System.out.println("Area of Circle :"+(pi*radius*radius));
       System.out.println("Circumference of Circle :"+(2*pi*radius));

    }
    
}
public class ClassDemo2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the radius :");
    int r=sc.nextInt();
    Circle c=new Circle();
    c.circle(r);
    
    
    }   
}
