package question17;

public class BothMethodIntoMainMethod {
    // Question 17.5 Call both user defined methods into main method.


    public static void main(String[] args){
        // access instance method via object
        BothMethodIntoMainMethod B = new BothMethodIntoMainMethod();
        B.name();
        name1();  // access static method without object
    }
    // Instance method
    public void name() {
        System.out.println("Stress");
    }
    // Static method
    public static void name1() {
        System.out.println("Just let it go");
    }
}
