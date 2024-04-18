package week7homework;

public class Question25 {

    // Question 25. Declare one method with return type and parameter and print your name in console.

    public static void main(String[] args) {
        Question25 Q = new Question25();
        String name = (Q.displayName("Komal"));

    }
    private String displayName(String name){
        System.out.println("I am " + name) ;
        return name;
    }
}
