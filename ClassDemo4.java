
import java.util.Scanner;

  class Temperature {
    void celsiusToFahrenheit(double c) {
        double r = (c *( 9.0f/5)) + 32;
        System.out.println("Temprature Converts CtoF ="+r);
    }
        void FahrenheitTocelsius(double f) {
        double r = (f- 32)*(5.0f/9);
        System.out.println("Temprature Converts FtoC ="+r);
    }
}

public class ClassDemo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Temperature t=new Temperature();
         t.celsiusToFahrenheit(30);
         t.FahrenheitTocelsius(273);

     
    }
}
