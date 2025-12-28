package LW_04;

import java.util.Scanner;

public class Q_01 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 numbers(a b c) : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.printf("You Entered : %d %d %d \n", a, b, c);

        int min;
        if (a <= b) {
            min = a;
        } else min = b;

        if (min >= c) min = c;

        System.out.println("Smallest number : " + min);
    }
}
