package week7homework;

import java.util.Scanner;

public class Question12 {
    // Question 12. Same as above program-11 using switch statement.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character between A to F:");
        String city = sc.nextLine();

    // Creating switch statement
    switch (city) {
        case "A":
            System.out.println("Aagra");
            break;
        case "B":
            System.out.println("Bhavnagar");
            break;
        case "C":
            System.out.println("chotila");
            break;
        case "D":
            System.out.println("Daman");
            break;
        case "E":
            System.out.println("East Delhi");
            break;
        case "F":
            System.out.println("Faizpur");
            break;
        default:
            System.out.println("INVALID DATA");


    }

    }


}
