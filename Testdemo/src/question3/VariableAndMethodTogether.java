package question3;

public class VariableAndMethodTogether {
    /* Question 3.4: 3.4 Call both instance and static variables into both instance and static methods inside the
print statement. */

    String name6 = "Komal Kanji"; // Instance variable
    static String name7 = "I am 26 Years old."; // Static variable


    public static void main(String[] args) {
        VariableAndMethodTogether V = new VariableAndMethodTogether();
        System.out.println(V.name6); // access instance variable vie object
        System.out.println(name7);  // access static variable without using object

        VariableAndMethodTogether M = new VariableAndMethodTogether();
        M.name8();   // access instance method vie object
        name9();    // access static method without using object

    }
    // Instance method
    public void name8() {
        System.out.println("I am from India.");

    }
    // static variable
    public static void name9() {
        System.out.println("Life is too short!");
    }
}
