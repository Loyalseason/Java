package Practice;
import java.util.Scanner;

public class StringPractice {

	public static void main(String[] Args) {
		
		Scanner input = new Scanner(System.in);
		String gmail;
		String username;
		String domainName;
		
		System.out.println("Hello, Input in Your Gmail");
		
		gmail = input.nextLine();
		
		System.out.println("My gmail is " + gmail);
		if (gmail.endsWith("gmail.com")) { 
			System.out.println(true);
			username =  gmail.substring(0, gmail.indexOf("@"));
			domainName = gmail.substring(gmail.indexOf("@")+1);
			  System.out.println("Username: " + username);
	          System.out.println("Domain Name: " + domainName);
			 
		}else {
			System.out.println(false);
			username =  gmail.substring(0, gmail.indexOf("@"));
			domainName = gmail.substring(gmail.indexOf("@")+1);
            System.out.println("Username: " + username);
            System.out.println("Domain Name: " + domainName);
		}
		
	}
}
