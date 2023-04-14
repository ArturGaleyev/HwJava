package HwClass9;

public class Hw5Animals {
    public static void main(String[] args) {
        String[] animals = {"Dog", "Snake", "Cat", "Mouse", "Elephant"};
        for (String animal : animals) {
            System.out.print(animal + "  ");
        }
        System.out.println();
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + "  ");
        }
        System.out.println();
        int i = 0;
        while (i < animals.length) {
            System.out.print(animals[i] + "  ");
            i++;
        }
    }
}
