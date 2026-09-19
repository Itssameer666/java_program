class Car{
String model;
double price;
Car(String model,double price){
   this.model=model;
   this.price=price;

}
void display(){
   System.out.println("Model Name :"+model);
   System.out.println("Price :"+price);
}
}
public class ClassDemo5 {
   public static void main(String[] args) {
      Car c=new Car("Maruti Suzki", 2999999);
      c.display();

       
   } 
}
