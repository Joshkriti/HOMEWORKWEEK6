package midweekhomework;

import java.util.Scanner;

public class Question_7 {

    /* 7. Take input of age of 3 people by user and determine oldest and youngest among
them. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First person age: ");
        int age1 = sc.nextInt();

        System.out.println("Second person age: ");
        int age2 = sc.nextInt();

        System.out.println("Third person age: ");
        int age3 = sc.nextInt();

        // Using IF else statement i have created younger version

        if (age1 < age2 && age1 < age3) {
            System.out.println("First person is youngest.");
        } else if (age2<age1 && age2<age3){
            System.out.println("Second person is youngest.");
        } else if (age3<age1 && age3<age2){
            System.out.println("Third person is youngest.");
        } else {
            System.out.println("Same age");
        }

        // Using IF else statement i have created older version

        if (age1>age2 && age1>age3) {
            System.out.println("First person is older.");
        } else if (age2>age1 && age2>age3){
            System.out.println("Second person is older");
        } else if (age3>age1 && age3>age2){
            System.out.println("Third person is older.");
        } else {
            System.out.println("Same age");
        }

    }


}
