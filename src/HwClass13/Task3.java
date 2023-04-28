package HwClass13;

public class Task3 {
    public static void main(String[] args) {

        /*
     How would you swap  2 strings without a temporary variable?
          */


        String a = "Friend";
        String b = "Family";


        a = a + b; //HiBye
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println(a);
        System.out.println(b);
    }

    }
