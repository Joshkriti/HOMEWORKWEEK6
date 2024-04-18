package week7homework;

import java.util.Scanner;

public class Question11 {
    /* Question 11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry. */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character between A to F:");
        String city = sc.nextLine();


       if (city.equals("A")){
           System.out.println("aagra");}
       else if (city.equals("B")) {
           System.out.println("Bhavnagar");
       } else if (city.equals("C")){
           System.out.println("Chotila");
       } else if (city.equals("D")){
           System.out.println("Delhi");
       } else if (city.equals("E")){
           System.out.println("Edinburgh ");
       } else if (city.equals("F")) {
           System.out.println("Florida");
       } else
           System.out.println("INVALID DATA");

        }



    }

