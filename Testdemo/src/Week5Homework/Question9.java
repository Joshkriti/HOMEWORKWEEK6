package Week5Homework;

public class Question9 {
    /* Question 9: Write a Java program to print the result of the following operations.
    Test Data: a. -5 + 8 * 6, b. (55+9) % 9, c. 20 + -3*5 / 8 d. 5 + 15 / 3 * 2 - 8 % 3
    Expected Output : 43  */

    public static void main(String[] args) {
        int X = -5;
        int Y = 8;
        int Z = 6;
        int V = X + Y * Z;

        short A = (55+9);
        int B = 9;
        int E = A / B;

        int F = 20;
        double G =  (double) (-3 * 5) /8;
        double H = F + G;

        int K = 5 + 15 / 3;
        int L = 2 - 8 % 3;
        int N = K * L;


        System.out.println(V);
        System.out.println(E);
        System.out.println(H);
        System.out.println(N);


    }



}
