package LW_01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter inner circle radius(ri) : ");
        int ri = input.nextInt();

        System.out.println("Enter outer circle radius(ro) : ");
        int ro = input.nextInt();


        Circle Ai = new Circle(ri);
        Circle Ao = new Circle(ro);

        double shadedArea = Ao.computeArea() - Ai.computeArea();

        System.out.println("Shaded Area is : "+shadedArea);
    }
}
