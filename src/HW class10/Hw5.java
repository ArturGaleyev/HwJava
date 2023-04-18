package HwClass10;

public class Hw5 {
    public static void main(String[] args) {
        /*Create a 2D array or integer type where you will store odd and
        even numbers in 3 rows and 4 columns. Develop a program which will
         identify/print the even numbers only.
        * */
        int[][] numbers = {
                {1,3,5,8},
                {9,31,11,9},
                {4,18,6,7}
        };
        for (int[] number : numbers) {
            for (int i : number) {
                if (i % 2 == 0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
