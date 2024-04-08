package question17;

public class StaticMethodAndInstanceVariable {
    // Question 17.4 Declare static method and call instance variable in print Statement.

    String name = "Life";  // Creating instance variable



    public static void main(String[] args){
        // access instance variable via object
        StaticMethodAndInstanceVariable I = new StaticMethodAndInstanceVariable();
        System.out.println(I.name);
        name1();  // access static method without object

    }
    // Static method
    public static void name1(){
        System.out.println("Have more fun in your life!");
    }

}
