package LW_03;

import java.util.Scanner;

public class Q_01 {
    static void main() {
        Scanner input = new Scanner(System.in);
        Temperature temp = new Temperature();

        System.out.println("Enter the celsius value : ");
        double celsius = input.nextDouble();
        temp.setCelsius(celsius);

        System.out.println("Fahrenheit value : " + temp.toFahrenheit());
    }
}
