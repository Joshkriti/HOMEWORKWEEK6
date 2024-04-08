package question3;

public class BothMethodAndMainMethod {
    /* Question 3.6:  3.6 Call both instance and static methods
     into the Main method and run the programme. */

    public static void main(String[] args){
        System.out.println("It's getting bit complicate."); // Main method
        // access to instance method vie object
        BothMethodAndMainMethod B = new BothMethodAndMainMethod();
        B.name4();
        name5();  // access to static method without writing object

    }
    // Instance method
    public void name4() {
        System.out.println("It's alright");
    }

    // static method
    public static void name5() {
        System.out.println("But I don't know");
    }

}


