package Practice;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("input first number");
	int A = sc.nextInt();
	System.out.println("input second number");
	int B = sc.nextInt();
		
		int Max, Min;
		
		if (A > B) {
			Max = A;
			Min = B;
			System.out.println("Max number = " + Max + "\nMin Number = " + Min);
		}
		else if(B > A) {
			Max = B;
			Min = A;
			System.out.println("Max number = " + Max + "\nMin Number = " + Min);
		}
		else if(A == B) {
			Max = Min = A;
			System.out.println("Equal Numbers");
		}

	}

}
