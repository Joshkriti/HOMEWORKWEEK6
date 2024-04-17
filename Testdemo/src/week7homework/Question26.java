package week7homework;

public class Question26 {

    // Write a Java program to reverse a word.
    //Sample Output:
    //Input a word: Komal
    //Reverse word: almoK


    public static void main(String[] args) {

        String originalString = "Komal Kanji";
        String reversedString = "";

        for (int I = 0; I < originalString.length(); I++) {
            reversedString = originalString.charAt(I) + reversedString;

        }
        System.out.println("Reversed string: " + reversedString);
    }


}
