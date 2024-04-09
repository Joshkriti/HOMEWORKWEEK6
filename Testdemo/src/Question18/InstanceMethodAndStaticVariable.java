package Question18;

public class InstanceMethodAndStaticVariable {
    // Question 18.3 Declare one instance method name borough() and call Static variable

    static String name = "Country:";  // Creating static variable

    public static void main(String[] args) {
        System.out.println(name); // access to static variable without using object
        InstanceMethodAndStaticVariable I = new InstanceMethodAndStaticVariable();
        I.borough(); // access to instance method vie object
    }


    // Instance method
    public void borough() {
        System.out.println("London");
    }
}
