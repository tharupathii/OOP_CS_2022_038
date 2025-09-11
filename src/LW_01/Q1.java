package LW_01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a odd-length word :");
        String word = input.next();
        int wordLength = word.length();

        System.out.println("Middle letter : "+word.substring(wordLength/2 , (wordLength/2)+1));
        //charAt(wordLength/2) can use
    }
}
