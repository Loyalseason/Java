package Practice;

public class ReverseAnNumbers {

	static int reverse(int a) {
		int r = 0;
		while(a != 0) {
			int remainder = a % 10;
			r = r * 10 + remainder;
			 a /= 10;  
		}
		return r;
		
	}
	
	static int reverse(int[] a) {
		int r = 0;
		for(int i = a.length; i < a.length; i-- ) {
			  		
			}
		return r;
	 }
	
	public static void main(String[]Args) {
		int a[] = {5, 4};
//		System.out.println(reverse(15));
		System.out.println(reverse(a));
	}
}
