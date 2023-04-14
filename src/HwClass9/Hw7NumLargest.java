package HwClass9;

public class Hw7NumLargest {
    public static void main(String[] args) {
        int[] numbers={101,204,23,77,300};

        int largest=numbers[2];
        for(int num:numbers){
            if (num>largest){
                largest=num;
            }
        }
        System.out.println(largest);

    }
}
