import java.util.Scanner;

public class TemperatureConverter {
    static double ctof(double celsius) {
        return (celsius * 9 / 5.0) + 32;
    }

    static double ftoc(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        System.out.println("Celsius to Fahrenheit: " + ctof(celsius));

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.println("Fahrenheit to Celsius: " + ftoc(fahrenheit));

        input.close();
    }
}
