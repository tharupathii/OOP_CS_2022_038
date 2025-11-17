package LW_02;

import java.util.Scanner;

public class Q_04 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the elements (with spaces) : ");

        int[] array = new int[5];
        int max = 0;
        int second = 0;
        for(int i=0 ; i<5 ; i++){
            array[i] = input.nextInt();
        }

        for(int j = 0 ; j<5 ; j++){
            if (max<array[j]) max=array[j] ;
            else if (second<array[j] && array[j]!=max) second=array[j];
        }
        

        System.out.printf("max : %d", max);
        System.out.printf("\n2nd max : %d", second);

    }
}
