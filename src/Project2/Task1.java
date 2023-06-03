package Project2;

public class Task1 {
    /*
Task 1:
Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
*/

    public static void reverse(String word) {
        StringBuilder reverse = new StringBuilder(word);
        String r = reverse.reverse().toString();
        System.out.println(r);
    }


   public static void main(String[] args) {

       reverse("Hello");

    }
}
