package midweekhomework;

import java.util.Scanner;

public class Question_8 {
    /* 8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
 Is student is allowed to sit in exam or not.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of classes held:");
        int X = sc.nextInt();

        System.out.println("Number of classes attended:");
        int Y = sc.nextInt();

        float Number;
        Number = ((Y * 100)/X);
        System.out.println(Number);

        if (Number>=75);{
            System.out.println("eligible:" + Number);
        } //else
        System.out.println("Not eligible:" + Number );




    }




}
