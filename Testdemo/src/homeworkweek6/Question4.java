package homeworkweek6;

public class Question4 {
    /* 4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme. */

    String name = "Life is too short!";
    String name1 = "So, Enjoy your life!";

    // Static variable
    static String name2 = "Make it more beautiful!";
    static String name3 = "Make it more enjoyable!";

    public static void main(String[] args) {
        Question4 Q = new Question4();
        System.out.println(Q.name); // access instance variable
        System.out.println(Q.name1);
        System.out.println(name2);  // access static variable
        System.out.println(name3);
        Q.name4();  // access instance method
        name5();  // access static method
    }




    public void name4(){
        System.out.println("I am getting there...");} // instance method
    public static void name5() {
        System.out.println("Have a fun!!");
    } // static method



}
