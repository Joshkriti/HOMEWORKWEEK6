package week7homework;

public class Question21 {

    // Question 21. Write a Java program to sum values of an array.

    public static void main(String[] args) {
      int myarray[] = {2, 3, 4, 15};
      int sum = 0;
      for (int I : myarray)
          sum += I;
        System.out.println("The sum is " + sum);
    }
}
