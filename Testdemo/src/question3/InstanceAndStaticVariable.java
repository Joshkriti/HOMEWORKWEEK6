package question3;

public class InstanceAndStaticVariable {
    // Question 3.1: Declare one instance and one static variable.

    String name = "Hello!!";  // Instance variable
    static String name1 = "How are you?"; // Static variable

    public static void main(String[] args){
        InstanceAndStaticVariable I = new InstanceAndStaticVariable();
        System.out.println(I.name); // access instance variable vie object
        System.out.println(name1);  // access static variable without object


    }

}

