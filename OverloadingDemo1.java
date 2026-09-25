//WAP to demostrate concept of constructor overloading
class Shape{
Shape(){
System.out.println("This is default constractor");
}
Shape(int s){
System.out.println("Area of Square :"+(s*s));
}
Shape(int l,int b){
System.out.println("Area of rectangle :"+(l*b));
}
}
class OverloadingDemo2{
public static void main(String [] args){
Shape s1=new Shape(); //this is default constructor
Shape s2=new Shape(10);//Area of square
Shape s3=new Shape(10,20);//Area of rectangle
}
}