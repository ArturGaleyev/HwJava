package GroupExercise;

public class Task3 {
    public static void main(String[] args) {
        // Create a 2D array or integer type where you will store odd and even numbers.
        //  Develop a program which will identify/print the even numbers only.
        int [] [] numbers={
                {12,10,21,45,65},
                {2,45,32,56,34,54},
                {34,345,643,56,43}
                
        };
        for (int[] num : numbers) {
            for (int allNumbers : num) {
                if (allNumbers % 2 == 0) {
                    System.out.print(allNumbers+" ");
                }
            }

        }
    }
}
