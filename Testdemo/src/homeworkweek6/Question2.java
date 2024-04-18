package homeworkweek6;

public class Question2 {
    /* Question 2: Write a Java programme using the following steps.
2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme. */

    static String name = "Komal"; // Static variable
    static String name1 = "Kanji"; // Another Static variable//

    public static void main(String[] args) { // main method
        System.out.println(name);
        System.out.println(name1);
        name2();  // Static method without using object
}
    public static void name2(){
        System.out.println("You're Welcome!!");}

}