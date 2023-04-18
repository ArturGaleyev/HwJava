package HwClass10;

public class Hw6 {
    public static void main(String[] args) {
        /*Create 2D array of countries: north america countries,
        south america countries, europe countries, asian countries,
        african countries. Then print all values from that array using
        2 different loops and calculate how many total countries been stored.
        */
        String [][] arr={
                {"USA,","Cuba,","Mexico,","Canada."},
                {"Brazil,","Uruguay,","Peru,","Paraguay."},
                {"Germany,","Italy,","France,","United Kingdom."},
                {"Vietnam,","Hong Kong,","China,","Japan."},
                {"Nigeria,","Somalia,","Central African Republic,","Uganda."}

    };

        for(int row=0; row< arr.length; row++){
            for(int columns=0; columns<arr[row].length; columns++){
                System.out.print(arr[row][columns]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //enhanced loop
        for (String[] countries: arr) {
            for(String country: countries){
                System.out.print(country+" ");
            }
            System.out.println();
    }
}
}
