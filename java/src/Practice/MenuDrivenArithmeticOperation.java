package Practice;
import java.util.Scanner;
public class MenuDrivenArithmeticOperation {
    
	public static void main(String[] Args){
		try (Scanner input = new Scanner(System.in)) {
			String options;
			int num1, num2;
			float total;
			System.out.println("Menu : \nADD \nSUB \nMUL \nDIV");
			System.out.println("Enter Two Numbers ");
				System.out.print("Num 1 : " );
				num1 = input.nextInt();
				System.out.print("Num 2 : " );
				num2 = input.nextInt();
				input.nextLine();
			System.out.println("Enter Options in words \nexample : 'ADD'");
			options = input.nextLine();	
			
			switch(options) {
			case "ADD": {
				total = num1 + num2;
				System.out.println("ADDITION = " + total);
				break;
			}
			case "SUB": {
				total = num1 - num2;
				System.out.println("ADDITION = " + total);
				break;
			}
			case "MUL": {
				total = num1 * num2;
				System.out.println("ADDITION = " + total);
				break;
			}
			case "DIV": {
				total = num1 / num2;
				System.out.println("ADDITION = " + total);
				break;
			}
			default: {System.out.println("Invalid Input");}
			
			
  }
		}
		
		
	
	}
}
