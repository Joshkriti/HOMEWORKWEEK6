package homeworkweek6;

public class Question5 {
    /* 5. Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.) */

    public static void main(String[] args) {
        int result=calculator(5,6); // 11
        int result1=calculator1(5,6);
        int result2=calculator2(5,6);
        int result3=calculator3(10, 2);

        System.out.println(result); //one way
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
    private static int calculator(int x, int y) {
        return x+y;
    }
    private static int calculator1(int a, int b){
        return a-b;
    }
   private static int calculator2(int k, int l){
        return k*l;
   }
   private static int calculator3(int c, int d){
        return c/d;
   }

}
