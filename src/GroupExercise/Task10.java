package GroupExercise;

public class Task10 {
    public static void main(String[] args) {

        String[] Cars = {"Bmw", "Audi", "Volvo", "Audi", "Toyota", "Honda"};

        for (int i = 0; i < Cars.length; i++) {
            for (int j = i+1 ; j < Cars.length; j++) {
                if (Cars[i].equals(Cars[j])) {
                    System.out.println("Duplicate element is: "+Cars[j]);
                }

            }

        }
    }
}
