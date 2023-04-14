package HwClass9;

public class Hw4Cars {
    public static void main(String[] args) {

        String[] cars = {"Toyota", "Dodge", "Honda", "Lamborghini", "Audi", "Maserati"};
        for (String car : cars) {
            System.out.print(car + "  ");
        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + "  ");
        }
        System.out.println();
        int i = 0;
        while (i < cars.length) {
            System.out.print(cars[i] + "  ");
            i++;
        }
    }
}
