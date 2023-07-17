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
	
	static int[] reverse(int[] a) {
	    int[] r = new int[a.length];  // Create an array to store the reversed elements
	    int j = 0;  // Index to insert elements into the reversed array

	    for (int i = a.length - 1; i >= 0; i--) {
	        r[j] = a[i];  // Assign the current element of 'a' to the reversed array 'r'
	        j++;  // Move to the next index in the reversed array
	    }

	    return r;
	}

	
	public static void main(String[] args) {
	    int[] a = {1, 2, 3, 4, 5};
	    int[] reversedArray = reverse(a);

	    for (int num : reversedArray) {
	        System.out.print(num + " ");
	    }
	}

}
