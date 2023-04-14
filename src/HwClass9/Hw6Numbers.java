package HwClass9;

public class Hw6Numbers {
    public static void main(String[] args) {
        int[] numbers = {71, 67, 65, 33, 93, 10, 14, 12};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
