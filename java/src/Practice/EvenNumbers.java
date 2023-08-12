package Practice;

public class EvenNumbers {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
        for(int b = 0; b < a.length; b++) {
        	if(a[b] % 2 == 0) {
        		System.out.println("Even number " + a[b]);
        	}
        }
	}

}
