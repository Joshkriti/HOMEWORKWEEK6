package week7homework;

import java.util.Scanner;

public class Question19 {

    // Question 19: Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int N = in.nextInt();

        if (N > 0) {
            System.out.println("Number is positive");
        }
        else if (N < 0){
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}
