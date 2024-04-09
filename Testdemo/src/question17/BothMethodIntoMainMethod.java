package question17;

public class BothMethodIntoMainMethod {
    // Question 18.5 Call both user defined methods into main method.


    public static void main(String[] args){
        // access instance method via object
        BothMethodIntoMainMethod B = new BothMethodIntoMainMethod();
        B.name();
        name1();  // access static method without object
    }
    // Instance method
    public void name() {
        System.out.println("Love");
    }
    // Static method
    public static void name1() {
        System.out.println("Just let it go");
        System.out.println("Make it more simple");
    }

}
