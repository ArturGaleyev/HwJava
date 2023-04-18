package HwClass10;

public class Hw4 {
   /* Create a 2D array or integer type and store numbers in 3 rows and 3
    columns. Print the sum of all numbers.
    */
    public static void main(String[] args) {
        int[][] numbers = {
                {1,3,15},
                {43,32,7},
                {49,21,5}
        };
        int sum = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
