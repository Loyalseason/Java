package Practice;

import java.util.Scanner;

public class Sin_Calculator {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.print("Enter the value of x: ");
	        double x = scanner.nextDouble();

	        System.out.print("Enter a positive integer n: ");
	        int n = scanner.nextInt();

	        // Calculate sin(x) using the series
	        double sinX = 0;
	        int sign = 1;

	        for (int i = 1; i <= n; i += 2) {
	            double term = 1.0;

	            for (int j = 1; j <= i; j++) {
	                term *= x;
	            }

	            term /= i;

	            if (sign % 2 == 0) {
	                sinX -= term;
	            } else {
	                sinX += term;
	            }

	            sign++;
	        }

	        // Display the result
	        System.out.println("sin(" + x + ") = " + sinX);

	        // Close the scanner
	        scanner.close();
	    }
}

