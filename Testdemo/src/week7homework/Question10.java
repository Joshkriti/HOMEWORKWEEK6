package week7homework;

import java.util.Scanner;

public class Question10 {
    /* 10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2% */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input sales Id: ");
        int number = sc.nextInt();

        System.out.println("Input seller's name: ");
        String name = sc.next();

        System.out.println("Input sales amount: ");
        int number1 = sc.nextInt();

        System.out.println("Input salary basic:");
        int salary = sc.nextInt();



    }
}
