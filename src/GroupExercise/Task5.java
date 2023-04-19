package GroupExercise;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Enter the two values to swap numbers");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();
        System.out.println("Before swap");
        System.out.println("First num="+a);
        System.out.println("Second num="+b);

        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("After swap");
        System.out.println("First num="+a);
        System.out.println("Second num="+b);




    }
}
