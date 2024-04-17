package week7homework;

public class Question11 {
    /* Question 11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry. */

    public static void main(String[] args){
       String city = "A";
       if (city == "A")
           System.out.println("aagra");
       else if (city.equals("B")) {
           System.out.println("Bhavnagar");
       } else if (city == "C"){
           System.out.println("Chotila");
       }


    }
}
