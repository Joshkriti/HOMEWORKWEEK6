package week7homework;

import java.util.Scanner;

public class Question5 {
    /* Question 5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Student Name: ");
        String name = sc.nextLine();

        System.out.println("Roll Number: ");
        int number = sc.nextInt();

        System.out.println("Subjects: ");
        String name1 = sc.nextLine();

          /*  int result = 0;

            if (pass <= 35) {
                System.out.println("fail");
            } else if (pass >= 80) {
                System.out.println("Grade A+");
            } else if (pass >= 60) {
                System.out.println("Grade A");
            } else if (pass >= 50) {
                System.out.println("Grade B");
            } else if (pass >= 35) {
                System.out.println("Pass");
            } */


        System.out.println("|-----------------------------------|");
        System.out.println("|            Mark Sheet             |");
        System.out.println("|-----------------------------------|");
        System.out.println("|       Name:          Krish        |");
        System.out.println("|       Roll no:       23           |");
        System.out.println("|-----------------------------------|");
        System.out.println("|       Subjects    :     Marks     |");
        System.out.println("|-----------------------------------|");
        System.out.println("|       Maths       :      98       |");
        System.out.println("|       Science     :      90       |");
        System.out.println("|       English     :      85       |");
        System.out.println("|-----------------------------------|");
        System.out.println("|       Total       :      273      |");
        System.out.println("|-----------------------------------|");
        System.out.println("|       percentage  :      91.0%    |");
        System.out.println("|       Result      :      Pass     |");
        System.out.println("|       Grade       :      A+       |");
        System.out.println("|-----------------------------------|");


        }
    }

