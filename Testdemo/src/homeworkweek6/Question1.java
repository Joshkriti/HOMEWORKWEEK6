package homeworkweek6;

public class Question1 {
    /* 1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme. */

    String name = "Komal"; // this is instance variables
    String name1 = "Kanji"; // this is instance variables

    public static void main(String[] args){
        Question1 V = new Question1();
        System.out.println(V.name);
        System.out.println(V.name1);
        V.name(); // access userDefined instance method to main method

    }
    // Instance Methods
    public void  name() {
        System.out.println("I am still learning....");
    }

}


