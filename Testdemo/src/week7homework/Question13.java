package week7homework;

import java.util.Scanner;

public class Question13 {
    /* Question 13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol(using if else) */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter operation you want to perform (+, -, *, /, %): ");
        String operation = sc.next();

        int result = performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }
    public static int performOperation(int firstNumber, int secondNumber, String operation)
    {
        int result = 0;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        }
        else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        }
        else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }
        else if (operation.equals("%")) {
            result = firstNumber % secondNumber;
        }
        else if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        }
        else {
            System.out.println("Invalid operation");
        }
        return result;
    }


}



