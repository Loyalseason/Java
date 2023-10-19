package Practice;

import java.util.Scanner;

public class IndexNo_4211220465 {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks Obtained");
        double input = sc.nextDouble();

        if (input > 80) {
            System.out.println("\nYou had an A");
        } else if (input > 60 && input <= 80) {
            System.out.println("\nYou had a B"); // Changed "an B" to "a B"
        } else if (input >= 50 && input < 60) {
            System.out.println("\nYou had a C"); // Changed "an C" to "a C"
        } else if (input >= 45 && input < 50) {
            System.out.println("\nYou had a D"); // Changed "an D" to "a D"
        } else if (input >= 25 && input < 45) {
            System.out.println("\nYou had an E"); // Changed "an E" to "an E"
        } else if (input < 25) {
            System.out.println("\nYou had an F");
        }

        sc.close(); 
    }
}
