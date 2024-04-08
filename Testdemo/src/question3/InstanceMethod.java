package question3;

public class InstanceMethod {
    // Question 3.2: Declare one instance method.

    public static void main(String[] args){
        InstanceMethod I = new InstanceMethod();
        /* access instance method vie writing object */
        I.name2();


    }
    // Instance method
    public void name2() {
        System.out.println("I am getting better..."); // Print out for instance method
    }
}
