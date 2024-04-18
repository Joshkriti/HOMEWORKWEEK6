package homeworkweek6;

public class Question19 {
    /* 19. Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method. */

    String name = "Vaishali";
    static String name1 = "Devel";

    public static void main(String[] args){
        Question19 S = new Question19();
        System.out.println(S.name);
        System.out.println(name1);
        S.selenium();
        agile();
    }

    // Instance Method
    public void selenium() {
        System.out.println("CODE1");
    }
    // Static Method
    public static void agile() {
        System.out.println("");
    }
}
