package HwClass13;

public class Task2 {
    public static void main(String[] args) {
        /*
        How would you check if String is palindrome or not? aba=> true
        Abbc =>false
         */

        String palindro="Abbc";
        palindro.replace(" ","");

        String reverse="";

        for (int i = palindro.length()-1; i >=0; i--) {
            reverse+=palindro.charAt(i);
            System.out.println(reverse);

        }
        boolean palindrome=true;
        for (int i = 0; i < palindro.length(); i++) {
            if(palindro.charAt(i)!= reverse.charAt(i)){
                palindrome=false;
            }
            if (palindrome){
                System.out.println("Is Palindrome");
            }else {
                System.out.println("Not a palindrome");
            }

        }}}
