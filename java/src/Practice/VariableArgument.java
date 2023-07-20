package Practice;

public class VariableArgument {
   
	static void show(int ...A) {
		for(int x : A) {
			System.out.println(x);
		}
	}
	
	static void showList(String ...S) {
		for(int i=0; i< S.length; i++) {
			System.out.println(i + 1 + ". " + S[i]);
		}
	}

	static int max(int ...A) {
	   if(A.length == 0) return Integer.MIN_VALUE;
	   
	   int m = A[0];
	   for(int i = 1; i < A.length; i++) 
		   if (A[i] > m) m = A[i];
		   
		   return m;
	   }
	
	 static int sum(int ...A) {
		int currNum = 0;
		  for(int i = 0; i<A.length; i++) {
			  currNum += A[i];
		  } 
		 return currNum;
	 }
	public static void main(String[] args) {
//		show();
//		show(5, 10, 30);
//		show(new int[] {5, 10, 30});
		
		
//		showList("John", "Smith", "Ama");
		
		
        System.out.println(max(1, 2, 3, 4 , 5 , 20));
		
		System.out.println(sum(1, 2, 3, 4, 5));
	}
}
