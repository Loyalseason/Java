package Practice;
import java.util.*;
public class password_checker {

	public static void main(String []Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your password");
		String password = sc.nextLine();
		System.out.println(password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~`!@#$%^&*()_+=])(?!.*//s).{8,}$"));
	}
}
