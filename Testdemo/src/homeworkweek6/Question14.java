package homeworkweek6;

public class Question14 {
    /* Question 14: Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5     */

    public static void main(String[] args) {
        int A = 125;
        int B = 24;
        int out = A + B;

        int C = 125;
        int D = 24;
        int out1 = C - D;

        int E = 125;
        int F = 24;
        int out2 = E * F;

        int X = 125;
        int Y = 24;
        int out3 = X / Y;

        System.out.println(out);
        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
    }
}
