package HwClass10;

public class Hw1 {
    public static void main(String[] args) {
     /*   Create a 2D array(shorter way) in which first array will consist of
    4 names and second array will contain grades. Then your program should
        print name of the students that has A and B grade */
        String[][] grades = {
                {"Antony", "Rob", "Emma", "Juan","John"},
                {"A", "C", "B", "A","F"}
        };

        for (int i = 0; i < 5; i++) {
            if (grades[1][i].equals("A") || grades[1][i].equals("B")){
                System.out.println(grades[0][i]);
            }
        }
    }
}
