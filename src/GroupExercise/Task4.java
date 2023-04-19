package GroupExercise;

public class Task4 {
    public static void main(String[] args) {

        int[][] myNumb= {{5,6,152,70,40,},
                {15,23,17,13,54,40}};
        int evenSum=0;
        int oddSum=0;

        for (int i = 0; i < myNumb.length; i++) {
            for (int j = 0; j < myNumb[i].length; j++) {

                if (myNumb[i][j] % 2 == 0) {
                    evenSum += myNumb[i][j];
                } else if (myNumb[i][j] % 2 != 0) {
                    oddSum += myNumb[i][j];
                }
            }
        }
        System.out.print(evenSum);
        System.out.println();
        System.out.print(oddSum);
    }
}
