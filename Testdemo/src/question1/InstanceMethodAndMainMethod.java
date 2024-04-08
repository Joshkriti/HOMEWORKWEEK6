package question1;

public class InstanceMethodAndMainMethod {
    /* Question 1.5: Call the above instance method
    into the Main method and run the programme. */

    // Main method
    public static void main(String[] args) {
        System.out.println("Hey It's me Komal.");
        InstanceMethodAndMainMethod I = new InstanceMethodAndMainMethod();
        I.name4();
    }

public void name4() {
    System.out.println("I am from India.");
}
}
