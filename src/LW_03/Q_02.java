package LW_03;

import java.util.Scanner;

public class Q_02 {
    static void main() {
        Scanner input = new Scanner(System.in);
        Temperature temp = new Temperature();
        System.out.println("Enter your Fahrenheit value :");
        double Fahrenheit = input.nextDouble();
        temp.setFahrenheit(Fahrenheit);

        System.out.println("Celsius value : " + temp.toCelsius());

    }
}
