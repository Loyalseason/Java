package Practice;
import java.util.*;
public class Getting_Domain_Mail {

	public static void main(String []Args) {
		
		System.out.println("Enter Your mail");
		Scanner sc = new Scanner(System.in);
		String gmail = sc.nextLine();
		String domain = gmail.substring(gmail.indexOf("@"));
	
		if(domain.equals("@gmail.com")) {
			System.out.println("You are hosted by Google : " + domain);
		}
		else if(domain.equals("@yahoo.com")) {
			System.out.println("Your are hosted by Yahoo : " + domain);
		}
		else {
			System.out.println("You are hosted somewhere else or your domain is wrong : " + domain);
		}
		
	}
}
