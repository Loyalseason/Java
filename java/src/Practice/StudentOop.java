package Practice;
class Student{
	public int rollNo;
	public String name;
	public String course;
	public int m1, m2, m3;
	
	public int total() {
		return m1 + m2 + m3;
	}
	
	public float average() {
		return total()/3;
	}
	public void grade() {
	    if (average() > 70) {
	    	System.out.println("Grade A");
	    }
	    else if(average() >= 60) {
	    	System.out.println("Grade B");
	    }
	    else if(average() >= 50) {
	    	System.out.println("Grade C");
	    }
	    else if(average() >= 40) {
	    	System.out.println("Grade D");
	    }
	    else if(average() < 40) {
	    	System.out.println("Grade F");
	    }    
	}
	
	public String detail() {
		return "Name : " + name +
				"\nRoll No: "+ rollNo +
				"\nCourse : " + course ;	
	}
	
}
public class StudentOop {

	public static void main(String []Args) {
		Student s1  = new Student();
		s1.rollNo = 1;
		s1.name = "Mac Jay";
		s1.course = "Business Admin";
		s1.m1 = 70;
		s1.m2 = 85;
		s1.m3 = 72;
		System.out.println(s1.detail());
		System.out.println(s1.total());
		System.out.println(s1.average());
		s1.grade();
		
	}
}
