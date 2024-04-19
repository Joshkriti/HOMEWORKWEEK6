package homeworkweek6;

public class Question10 {

    /* 10. Write a Java program that takes a number as input and prints its multiplication
table up to 10.
Test Data: Input a number: 8.
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 10 = 80 */

    public static void main(String[] args) {
        // Creating loop to write 8 timetable

        for (int I = 0; I <= 10; I++){
            System.out.println("8 * " + I + " = " + (8*I));
        }
    }
}
