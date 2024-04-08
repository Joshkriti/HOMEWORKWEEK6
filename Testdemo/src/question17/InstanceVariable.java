package question17;

public class InstanceVariable {
    //Question 17.1 Declare your city as instance variables.

// Creating my city "London" as instance variable
    String name = "London";

    public static void main(String[] args){
        InstanceVariable V = new InstanceVariable();
        System.out.println(V.name); // access instance variable via object
    }
}
