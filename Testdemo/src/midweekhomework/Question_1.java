package midweekhomework;

import java.util.Scanner;

public class Question_1 {
    /* 1. Take 10 integers from keyboard using loop and print their average value on the
screen. */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 10; i++ );
        {
            System.out.println("Enter number: ");
            sum = sum + sc.nextInt();
        }
        // Average formula
        int average = sum / 10;
        System.out.println("Average is " + average);


    }




}
