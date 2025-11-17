package LW_02;

import java.util.Scanner;

public class Q_03 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many lines u need :");
        int lines = input.nextInt();

        for(int i = 1 ; i<=lines ; i++){

            for (int s = 1; s <= lines - i; s++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
