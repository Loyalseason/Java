package Practice;

public class FindingSumOfAllElements {

	public static void main(String [] Args) {
		
		int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
		int sum = 0;
		
//		for(int i = 0; i < A.length; i++) {
//			
//		   sum += A[i];
//		}
		
		for(int x : A) {
			System.out.println(x);
			sum += x;
		}
		
		System.out.println("Total = " + sum);
	}
}
