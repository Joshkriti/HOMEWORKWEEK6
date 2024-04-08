package question4;

public class InstanceMethod {
    // Question 4.2: Declare one instance method.

    public static void main(String[] args){
        // access instance method vie object
        InstanceMethod I = new InstanceMethod();
        I.name4();

    }

    // Instance method
    public void name4(){
        System.out.println("I am getting there...");
    }
}
