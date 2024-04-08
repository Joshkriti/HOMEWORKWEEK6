package question4;

public class VariableAndMethodTogether {
    /* Question 4.4 Call all four instance and static variables into both instance and static methods inside the
print statement. */

    String name6 = "Work "; // Instance variable
    static String name7 = "Work is not everything."; // Static variable


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
        System.out.println("Money");

    }
    // static variable
    public static void name9() {
        System.out.println("Money is not everything.");
    }
}
