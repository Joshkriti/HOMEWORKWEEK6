package Question18;

public class BothMethodIntoMainMethod {
    // Question 18.5 Call both user defined methods into main method.


    public static void main(String[] args){
        // access user defined instance method via object  (main method)
        question17.BothMethodIntoMainMethod B = new question17.BothMethodIntoMainMethod();
        B.name();
        name1();  // access user defined static method without object (main method)
    }

    // Instance method
    public void name() {
        System.out.println("Happy");
    }

    // Static method
    public static void name1() {
        System.out.println("Just be yourself");
        System.out.println("Make it more fun");
    }
}
