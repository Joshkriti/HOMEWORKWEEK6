package week7homework;

public class Question8 {
    // Question 8. Write a java program to get numbers from users and print whether it is positive or negative.

    public static void main(String[] args) {
        int number = 125;
        // Creating IF statement to find positive and negative number
        if (number>0) {
            System.out.println("The number is positive");
        } else if (number<0){
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }


    }
}