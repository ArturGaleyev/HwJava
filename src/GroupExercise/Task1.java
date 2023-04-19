package GroupExercise;

public class Task1 {
    public static void main(String[] args) {
         int [] temperature={67,77,54,46,92};

         int largest=temperature[2];
        for (int highNum:temperature) {
            if (highNum>largest){
                largest=highNum;
            }

        }
        int lower=temperature[4];
        for (int lowNum:temperature) {
            if (lowNum<lower){
                lower=lowNum;
            }

        }
        System.out.println(largest);
        System.out.println(lower);
    }
}
