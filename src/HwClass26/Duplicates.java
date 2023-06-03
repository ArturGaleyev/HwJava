package HwClass26;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        var calcSum = new ArrayList<>(Arrays.asList(1,1,2,3,4,6,7,8,9));
        int s = 0;
        for(var sum: calcSum){
            s+=sum;
        }
        System.out.println(s);
    }
}
