package HwClass16;

/* Create a method that will accept a String as a parameter and
 return a new String that consist only of vowels.
  Method should be available inside the class only where it was declared
  and executed by calling it is name */
public class Task2 {
    static String vowels (String str ) {
        str=str.replaceAll("[^sadfg]", "");
        return str;
    }

    public static void main(String[] args) {
        System.out.println(Task2.vowels("Antony"));
    }
}
