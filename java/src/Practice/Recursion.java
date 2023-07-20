package Practice;

public class Recursion {
    static void funRecursion(int n) {
    	if (n>0) {
    		System.out.println(n);
    		funRecursion(n - 1);
    	}
    }
    
    static void fun(int n) {
    	if(n>0) {
    		fun(n-1);
    		System.out.println(n);
    	}
    }
	public static void main(String[] args) {
		funRecursion(4);
		System.out.println();
		fun(4);
	}
}
