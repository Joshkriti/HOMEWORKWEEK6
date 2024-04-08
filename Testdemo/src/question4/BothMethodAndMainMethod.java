package question4;

public class BothMethodAndMainMethod {
    /* Question 4.6: Call both instance and static methods into the Main method and run the programme. */

    public static void main(String[] args){
        System.out.println("How is everything?"); // Main method
        // access to instance method vie object
        BothMethodAndMainMethod B = new BothMethodAndMainMethod();
        B.name4();
        name5();  // access to static method without writing object

    }
    // Instance method
    public void name4() {
        System.out.println("Everything is fine");
    }

    // static method
    public static void name5() {
        System.out.println("But it's too much ");
    }
}
