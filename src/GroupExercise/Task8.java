package GroupExercise;

public class Task8 {
    public static void main(String[] args) {

        int[] numbers={101,204,23,77,300};

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            {
                if (numbers[i] > maxNumber) {
                    maxNumber = numbers[i];
                } else if (numbers[i] < minNumber) {
                    minNumber = numbers[i];
                }
            }


        }
        System.out.println("Maximum number is " + maxNumber);
        System.out.println("Minimum number is " + minNumber);


    }
}
