package LW_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        numberOfDigits test = new numberOfDigits();


        while (true) {

            System.out.println("Enter :");
            int x = input.nextInt();
            if (x < 0) {
                System.out.println("---U entered negative value!---");
                break;
            }
            test.countDigit(x);
        }

    }
}
