package HwClass12;

public class Task2 {
    public static void main(String[] args) {

        /*
        Create a string and print it in reverse order
         */


        String cars="Mercedes";

        for (int i = cars.length()-1; i >=0 ; i--) {
            System.out.print(cars.charAt(i));
        }



    }
}
