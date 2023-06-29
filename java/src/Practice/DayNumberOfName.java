package Practice;
import java.util.Scanner;
public class DayNumberOfName {
  
	public static void main(String[] Args) {
		Scanner input = new Scanner(System.in);
		int day;
		System.out.println("Display a day name based on the number");
		day = input.nextInt();
		switch(day) {
		case 1 : {
			System.out.println("Day: Monday " + "Name : \nMale: Kojo \n Female: Adjoa");
			break;
		}
		case 2 : {
			System.out.println("Day : Tuesday " + "Name : \nMale: Kwabena \n Female: Abena");
			break;
		}
		case 3 : {
			System.out.println("Day : Wednesday " + "Name : \n Male: Kweku \n Female: Afua");
			break;
		}
		case 4 : {
			System.out.println("Day : Thursday " + "Name : \nMale: Yaw \n Female: Yaa");
			break;
		}
		case 5 : {
			System.out.println("Day : Friday " + "Name : \nMale: Kofi \n Female: Efia");
			break;
		}
		case 6 : {
			System.out.println("Day : Saturday " + "Name : \nMale: Kwame \n Female: Ama");
			break;
		}
		case 7 : {
			System.out.println("Day : Sunday " + "Name : \nMale: Kwesi \n Female: Akosua");
			break;
		}
		
		default: {
			System.out.println("Invalid Input try again");
		   }
		} 
	
		
	}
}
