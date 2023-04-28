package HwClass12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
 Write a program that reads two people's first
 names and if they're expecting boy or girl?
 Based on the input suggests a name for a baby:
 Example Output:
 Mom’s first name? Mary
 Dad’s first name? Daniel
 Boy or Girl? boy
 Suggested baby name: DANRY
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Mom's first name?");
        String momName = scan.next();
        System.out.println("Dad's First name?");
        String dadName = scan.next();
        System.out.println("Boy or Girl?");
        String boyGirl = scan.next();

        if (boyGirl.equalsIgnoreCase("boy")) {
            String babyName = dadName.substring(0,3) + momName.substring(momName.length() - 2);
            System.out.println(babyName);
        } else if (boyGirl.equalsIgnoreCase("girl")) {
            String babyName = momName.substring(0,3) + dadName.substring(dadName.length() - 2);
            System.out.println(babyName);
        }
    }
}
