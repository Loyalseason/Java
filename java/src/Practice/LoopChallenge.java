package Practice;

import java.util.Scanner;

public class LoopChallenge {

	public static void main(String [] Args) {
		 
	// While Loop	
//		int n = 1; 
//		while(true) {
//			System.out.println(n);
//			n++;
//		} 
		
		
		
		//Do while
//		int n = 0;
//	do {
//		System.out.println(n);
//		n++;
//	}while(n != 101);
		
		
		
	
	// For Loop
//  Increment loop
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
//	Decrement loop
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}
		
// Infinite loop with for
//		int i = 0;
//		for(;;) {
//			System.out.println(i);
//			i++;
//		}
		
		
// Display Multiplication Table	
//		int n = 2;
//		 for(int i = 0; i<=50; i++) {
//			 System.out.println( n + " * " + i + " = " + n * i );
//			 }
		
// Find the sum of n numbers using loops
//		int n = 10;
//		int total = 0;
//       for(int i = 1; i <= n; i++) {
//    	   System.out.println(total + " + " + i + " = " + (total+i)); 
//    	   total += i;
//    	   
//       } 
		
//Factorial of numbers using loops
		
		try (Scanner input = new Scanner(System.in)) {
			int num;
			System.out.println("Enter a number to find the factorial");
			num = input.nextInt();
			
			int total = 1;
      for(int i = 1; i <= num; i++) {
			   System.out.println(i +" * "+total + " = " + (i * total));  
			   total *= i;
			   
      }
		} 
       
	}
	
}
