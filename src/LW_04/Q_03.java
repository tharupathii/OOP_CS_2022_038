package LW_04;

import java.util.Scanner;

public class Q_03 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the power of 10 (x : 10^x) : ");
        int a = input.nextInt();
        System.out.println("You entered : " + a);

        switch (a){
            case 6 :
                System.out.println("Million");
                break;
            case 9 :
                System.out.println("Billion");
                break;
            case 12 :
                System.out.println("Trillion");
                break;
            case 15 :
                System.out.println("Quadrillion");
                break;
            case 18 :
                System.out.println("Quintillion");
                break;
            case 21 :
                System.out.println("Sextillion");
                break;
            case 30 :
                System.out.println("Nonillion");
                break;
            case 100 :
                System.out.println("Googol");
                break;

        }
    }


}
