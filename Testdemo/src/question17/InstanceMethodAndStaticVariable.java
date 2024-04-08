package question17;

public class InstanceMethodAndStaticVariable {
    // Question 17.3 Declare one instance method and call static variable in print statement

    // Creating static variable
    static String name = "United Kingdom";

    public static void main(String[] args){
        System.out.println(name); // access static variable without using object
        // access instance method via object
        InstanceMethodAndStaticVariable I = new InstanceMethodAndStaticVariable();
        I.name1();

    }

    // Creating instance method
    public void name1() {
        System.out.println("It's beautiful country.");
    }



}
