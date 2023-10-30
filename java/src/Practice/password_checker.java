package Practice;
import java.util.*;
public class password_checker {

	public static void main(String []Args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Your password");
//		String password = sc.nextLine();
//		System.out.println(password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~`!@#$%^&*()_+=])(?!.*//s).{8,}$"));
		
		int arr[] = {5, 4, 3, 2, 1};
		boolean found = false;
		System.out.println("Enter a number to search through the array");
		int num = sc.nextInt();
		
		for(int x = 0; x < arr.length; x++) {
			if(num == arr[x]) {
				found = true;
				break;
			}
		}
		if(found == true) {
			System.out.println("The number is in the array");
		}
		else {
			System.out.println("The number isn't in the array");
		}
		
	}
}
