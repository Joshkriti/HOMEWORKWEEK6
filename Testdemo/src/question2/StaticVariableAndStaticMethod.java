package question2;

public class StaticVariableAndStaticMethod {
    /* Question 1.3: Call both static variables
     into the static method inside the print statement */

    static String name2 = "Name:"; // Static Variable
    public static void name3() {
        System.out.println("Komal Kanji"); // Static method
    }
    public static void main(String[] args){
        System.out.println(name2);// access static variable without object
        name3(); // Static method without using object

    }

}
