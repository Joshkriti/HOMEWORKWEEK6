package week7homework;

public class Question15 {
    // Question 15. Write a program that tells us input value is number or an alphabet or symbol.

    public static void main(String[] args) {
        char c = 'k';

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");




    }





}