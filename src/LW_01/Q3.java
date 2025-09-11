package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length(cm) :");
        float cm = input.nextFloat();

        float inch = (float) (cm / 2.54);
        int feet = (int)(inch/12);
        inch = inch % 12;

        System.out.println("Length : "+inch+" inches  "+feet+" feet ");

    }
}
