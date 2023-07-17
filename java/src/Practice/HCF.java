package Practice;

public class HCF {
	
	static void isHCF(int a, int b) {
		
		for(int i = 1; i <= a || i <= b; i++) {
			
			if(a % i == 0 && b % i == 0) {
		     System.out.print(i + " ");
			} 
		}
	}
     
	public static void main(String[] Args) {
		int m = 125, n =625;	
		isHCF(m, n);
	}
}



