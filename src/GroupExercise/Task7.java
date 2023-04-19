package GroupExercise;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int k,l=1,j=1;
        Scanner scan=new Scanner(System.in);
        k=0;
        System.out.println("Please Enter any number");
        int n=scan.nextInt();
        System.out.print(" 1 1 ");
        while (k<=n){
            k=l+j;
            if(k>=n)
                break;
            System.out.print(k +" ");
            l=j;
            j=k;
        }

    }
}
