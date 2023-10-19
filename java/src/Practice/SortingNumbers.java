package Practice;

public class SortingNumbers {

	public static void main(String []Args) {
		int a = 7;
		int b = 8;
		int c = 4;
		
		if (a > b && b > c) {
			System.out.println(a+" "+ b+" "+ c);
		}
		else if(b > c && c > a) {
			System.out.println(b+" "+ c+" "+ a);
		}
		else if(c > a && a > b ) {
			System.out.println(c+" "+ a+" "+ b);
		}
		
	}
}
