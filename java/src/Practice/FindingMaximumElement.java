package Practice;

public class FindingMaximumElement {
  
	public static void main(String [] Args) {
		int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
		int max = A[0], max2 = A[0];
		
		for(int i = 0; i < A.length; i++) {
//			 System.out.println(A[i]);
			
			if(A[i] > max) {
				max2 = max;
				max = A[i];
			}
			else  if(A[i] > max2) {
				max2 = A[i];
			}
			 
		}
		System.out.println(max);
		System.out.println(max2);
	}
}
