package homeworkweek6;

import java.util.Scanner;

public class Question8 {

    /* 8. Write a program to insert any temperature value in degree Fahrenheit and convert to
degree Celsius ((F − 32) × 5/9 = 0°C).*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a degree: ");
        double fahrenheit = sc.nextDouble();

        double celsius =((5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + celsius);

    }
}


