package homeworkweek6;

public class Question17 {
    /* 17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method. */

    String city = "Diu";  // Instance variable
    static String country = "India"; // Static variable

    public static void main(String[] args){
        Question17 V = new Question17();
        System.out.println(V.city); // access instance variable
        System.out.println(country); // access static variable
        V.name(); // access instance method
        name1(); //  access static method
    }


    // Instance method
    public void name(){
        System.out.println("I am from India.");
    }
    static void name1(){
        System.out.println("India is my country.");
    }
}
