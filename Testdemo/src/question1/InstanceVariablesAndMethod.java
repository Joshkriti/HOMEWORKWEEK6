package question1;

public class InstanceVariablesAndMethod {
    /* Question 1.3: Call both instance variables into the
    instance method inside the print statement. */

    String name = "Komal Kanji"; // Instance variable

    public static void main(String[] args) {
        InstanceVariablesAndMethod V = new InstanceVariablesAndMethod();
        V.name2(); // access instance method to main method
        System.out.println(V.name); // access instance variable

    }

    // Instance Methods
    public void name2() {
        System.out.println("Komal"); // Print out for instance method
    }
}
