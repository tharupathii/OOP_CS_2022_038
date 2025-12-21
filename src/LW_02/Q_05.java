package LW_02;

import java.util.Scanner;

public class Q_05 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String word;
        word = input.nextLine();
//        word = word.trim();
        word = word.toLowerCase();
        word = word.replaceAll("[^a-z]" , "");
        //word = new StringBuilder(word).reverse().toString();
        String reversed = new StringBuilder(word).reverse().toString();

        //System.out.println(reversed);
        System.out.println("Word : "+word);
        System.out.println("Reversed : "+reversed);
        if(word.equals(reversed)) System.out.println("The sentence is a palindrome");
        else System.out.println("The sentence is not a palindrome");




    }
}
