package LW_04;

import java.util.Scanner;

public class Q_04 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = in.nextInt();
        String type;

        type = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? "Leap" : "Not a Leap";

        System.out.printf("___It is %s year___", type);

    }
}
