package Practice;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close(); 

        for (int a = 0; a <= 12; a++) {
            int total = num * a;
            System.out.println(num + " * " + a + " = " + total);
        }
    }
}
