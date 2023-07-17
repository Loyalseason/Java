package Practice;

//  1,2,3,5,7,11

public class FindAPrimeNumber { 
 
	static int primenum(int a) {
           for(int i = 2; i <= a/2; i++) {
        	   if(a % i == 0) 
        		   return i; 
           }
           return a;  
             
	}
	
	public static void main(String[] Args) {
		
		
		int a = 1;
		System.out.println(primenum(a)); 
		
	}
}
