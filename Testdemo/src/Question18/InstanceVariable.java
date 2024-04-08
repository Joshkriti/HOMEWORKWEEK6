package Question18;

public class InstanceVariable {
    // Question 18.2 Declare your house number as instance variables.

    // Creating instance variable via your house number
    String name = "HouseNumber";
    static int num = 46;

    public static void main(String[] args) {
        InstanceVariable V = new InstanceVariable();
        System.out.println(V.name);
        System.out.println(num);


    }
}
