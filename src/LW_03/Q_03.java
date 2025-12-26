package LW_03;

import java.util.Scanner;

public class Q_03 {
    static void main() {
        Scanner input = new Scanner(System.in);
     //   Bicycle b1 = new Bicycle();
     //   Owner o1 = new Owner();
        Owner o2 = new Owner("owner02","02020202");
        Bicycle b3 = new Bicycle(o2);
        System.out.println(""+b3.getOwner().getOwnerName()+b3.getOwner().getPhoneNo());
    }
}
