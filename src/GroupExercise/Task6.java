package GroupExercise;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int n = input.nextInt();

    boolean prime = true;

    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            prime = false;
            break;
        }
    }

    if (prime) {
        System.out.println(n + " is a prime number.");
    } else {
        System.out.println(n + " is not a prime number.");
    }

}
}
