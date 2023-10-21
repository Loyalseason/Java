package Practice;
import java.util.*;
public class Getting_Domain_Mail {

	public static void main(String []Args) {
		
		System.out.println("Enter Your mail");
		Scanner sc = new Scanner(System.in);
		String gmail = sc.nextLine();
		boolean domain = gmail.matches("[a-z]*@gmail.*");
		
		String domain2 = gmail.substring(gmail.indexOf("@"));
	
		if(domain2.equals("@gmail.com")) {
			System.out.println("You are hosted by Google : " + domain2);
		}
		else if(domain2.equals("@yahoo.com")) {
			System.out.println("Your are hosted by Yahoo : " + domain2);
		}
		else {
			System.out.println("You are hosted somewhere else or your domain is wrong : " + domain);
		}

		System.out.println(domain);
		sc.close();
	}
}
