package homeworkweek6;

public class Question20 {
    /* 20. Write a Java Program using below steps.
20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method. */

    static String name = "Spain";
    String name1 = "United Kingdom";

    public static void main(String[] args){
        Question20 Q = new Question20();
        System.out.println(Q.name1);
        System.out.println(name);
        Q.homeCountry();
        agile();

    }

    // Instance Method
    public void homeCountry() {
        System.out.println("India");
    }
    // Static Method
    public static void agile(){
        System.out.println("Agile have 5 serum which include backlog grooming, daily stand up meeting, sprint planning meeting, sprint review and sprint retrospective.");
    }
}
