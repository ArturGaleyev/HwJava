package Project2;

import java.util.Arrays;

public class Task4 {
    /*
      task:
      Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
      meaning they contain the same characters in a different order.
      For example, "listen" and "silent" are anagrams.
     */
    public static boolean isAnagram(String str, String str2){
        boolean check;
        str=str.replaceAll(" ","").toLowerCase();
        str2=str2.replaceAll(" ","").toLowerCase();

        if(str.length()!=str2.length()){
            check=false;
        }

        char [] a= str.toCharArray();
        char [] b= str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            check=true;
        }else{
            check=false;
        }
        return check;
    }

    public static void main(String[] args) {

        boolean c=isAnagram("Silent","listen");
        System.out.println(c);


    }
}
