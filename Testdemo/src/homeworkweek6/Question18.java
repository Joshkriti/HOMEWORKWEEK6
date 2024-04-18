package homeworkweek6;

public class Question18 {
    /* 18. Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method. */

    static String name ="London Borough of Brent";   // static variable
    int number = 46; // instance variable

    public static void main(String[] args){
        Question18 V = new Question18();
        System.out.println(name);
        System.out.println(V.number);
        address();
        V.borough();

    }

    // Instance method
    public void borough() {
        System.out.println("London");
    }

    // Static method
    public static void address() {
        System.out.println("Stanley Park Drive, Wembley");
    }

}
