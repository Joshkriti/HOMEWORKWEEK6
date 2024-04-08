package question2;

public class StaticMethodAndMainMethod {
    /* Question 2.5: Call the static method
    into the Main method and run the programme. */

    public static void main(String[] args) {
        System.out.println("Thank You"); // Main method
        name5(); // Static method without using object
    }
    public static void name5() {
        System.out.println("You're Welcome!!!"); // Static method
    }

}
