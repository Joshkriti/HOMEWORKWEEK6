package homeworkweek6;

public class Question3 {

    /* 3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme. */

    String name = "Komal";  // instance variable

    static String name1 = "Kanji";  // static variable

    public static void main(String[] args) {
        Question3 Q = new Question3();
        System.out.println(Q.name); // access instance variable
        System.out.println(name1);  // access static variable
        Q.name2(); // access instance method
        name3(); // access static method
    }


    // instance method
    public void name2() {
        System.out.println("I am getting better..."); // Print out for instance method
    }

    // Static method
    public static void name3() {
        /* Print out for static variable */
        System.out.println("Komal, You are doing good so far.");
    }
}
