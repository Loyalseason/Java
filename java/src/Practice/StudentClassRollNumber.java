package Practice;

import java.util.Date;

class rollNumber{
   private static int rollNumber = 101199;
   
	String name;
	int age;
	double amount;

	rollNumber(String name, int age, double amount){
        this.name = name;
        this.age = age;
        this.amount = amount;
     
        rollNumber++; 
	}
	
	public String toString() {
		return rollNumber + " " + " " + this.name + " " + this.age + " " + this.amount;
	}
	
}
public class StudentClassRollNumber {
			
		public static void main(String []args) {
			Date d = new Date();
			rollNumber r = new rollNumber("Abigail", 2, 56.54);	
			System.out.println("GCTU-"+ (d.getYear()+1900) + "" + r.toString());
			rollNumber r2 = new rollNumber("Emmanuel", 23, 56.54);	
			
			System.out.println("GCTU-"+ (d.getYear()+1900) + "" + r2.toString());
		}
}
