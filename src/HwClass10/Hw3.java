package HwClass10;

public class Hw3 {
    public static void main(String[] args) {

        /*Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops
        */
        String[][] groceries = {
                {"Potatoes", "Carrots", "Broccoli"},
                {"Mandarins", "Pineapple", "Mango"},
                {"Milk", "Cheese","Yogurt","cream Cheese "},
                {"Candy", "Cookies", "Honey","Gum"}
        };

        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.print(groceries[i][j]+" ");
                System.out.println();
            }
        }
        System.out.println();

        for (String[] str : groceries) {
            for (String List : str) {
                System.out.println();
                System.out.print(List +" ");
            }

        }
    }
}
