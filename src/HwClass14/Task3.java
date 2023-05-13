package HwClass14;

public class Task3 {
    /*
    Write a method to return whether given number is prime or not?
  */
    boolean  isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Task3 obj = new Task3();
        boolean primeNumber = obj.isPrime(2);
        System.out.println(primeNumber);

    }
}
