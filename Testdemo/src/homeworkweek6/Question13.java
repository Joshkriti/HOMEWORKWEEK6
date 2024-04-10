package homeworkweek6;

public class Question13 {
    /* Question 13: Write a Java program to print the area and perimeter of a rectangle.
    Test Data: Width = 5.5 Height = 8.5
    Expected Output:
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20    */


    // Equation for finding area of rectangle
    public static void main(String[] args) {
        double area = 5.5;
        double area1 = 8.5;
        double area2 = area * area1;

        // Equation for finding perimeter of rectangle

        int A = 2;
        double B = (5.6 + 8.5);
        int perimeter = (int) (B * A);


        System.out.println(area2);
        System.out.println(perimeter);

    }


}

