package Practice;
import java.util.Scanner;
public class SearchingAnElementUsingArray {

	public static void main(String [] Args) {
		int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check ");
		int ans = input.nextInt();
		
		for(int i = 0; i < A.length; i++) {
			if(ans == A[i]) {
				System.out.println("Number is in the array");
				System.exit(0);
			}	
		}
		System.out.println("Number isn't in the array");
			
	}
}
