package LW_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String fname,mname,lname;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name :");
        fname = input.next();

        System.out.println("Enter your Middle Name :");
        mname = input.next();

        System.out.println("Enter your Last Name :");
        lname = input.next();

        System.out.println("Hi ! "+lname+", "+fname+" "+mname.substring(0,1)+".");
    }
}
