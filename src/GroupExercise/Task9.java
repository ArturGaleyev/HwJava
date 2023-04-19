package GroupExercise;

public class Task9 {
    public static void main(String[] args) {
        int [] num={123,423,4345,8567,43,234,455,75};
        int largest = num[0];
        int secondLargest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];

            } else if (num[i] > secondLargest) {
                secondLargest = num[i];
            }

        }
        System.out.println("The second Largest is " + secondLargest);


    }
}
