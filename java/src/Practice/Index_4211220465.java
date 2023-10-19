package Practice;

import java.util.Scanner;

public class Index_4211220465 {
	
	public static void main(String []Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Classes Held : ");
	    int inputA = sc.nextInt();
	    System.out.println("Number of Classes Attened : ");
	    int inputB = sc.nextInt();
	    
	    double perOfClassAttended = (inputB * 100) / inputA;
	    if(perOfClassAttended >= 75.0) {
	    	System.out.println("Student is allowed to Sit in Exams");
	    }else if(perOfClassAttended < 75.0) {
	    	System.out.println("Student isn't allowed to Sit in Exams");
	    }
        System.out.println("\nPercentage of Class Attended : " + perOfClassAttended + "%" );
	    
	}

}
