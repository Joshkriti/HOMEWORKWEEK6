package question4;

public class InstanceAndStaticVariable {
        // Question 4.1 Declare two instance and two static variables.

        // Instance variable
    String name = "Life is too short!";
    String name1 = "So, Enjoy your life!";

        // Static variable
    static String name2 = "Make it more beautiful!";
    static String name3 = "Make it more enjoyable!";

    public static void main(String[] args){
        // access to instance variable via object
        InstanceAndStaticVariable V = new InstanceAndStaticVariable();
        System.out.println(V.name);
        System.out.println(V.name1);
        // access  to static variable without using object
        System.out.println(name2);
        System.out.println(name3);

    }
}
