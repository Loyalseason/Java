package Practice;
class Subject{
	String subID;
	String name;
	int maxMarks;
	int marksObtain;

	Subject(String subID, String name,int maxMarks){
		this.subID = subID;
		this.name = name;
		this.maxMarks =  maxMarks;
	}
	
	public String getSubID() {
		return subID;
	}

	public String getName() {
		return name;
	}

	public double getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	public int getMarksObtain() {
		return marksObtain;
	}
	public void setMarksObtain(int marksObtain) {
		this.marksObtain = marksObtain;
	}
	
	boolean isqualified(int m) {
		return marksObtain >= maxMarks/10*40;
	}
	
	public String toString() {
		return "\nSubject ID: " +subID+ "\nName : "+ name + "\nMarks : "+ maxMarks;
	}
}


//class Student1{
//	String rollNo;
//	public String getRollNo() {
//		return rollNo;
//	}
//	public String getName() {
//		return name;
//	}
//	public String getDept() {
//		return dept;
//	}
//	public String getSubject() {
//		return Subject;
//	}
//	String name; 
//	String dept;
//	String Subject;
//	
//}
public class ArrayOfObjects {

	public static void main(String[] Args) {
		Subject subs[] = new Subject[3];
		subs[0] = new Subject("001", "Mathematics", 75);
		subs[1] = new Subject("002", "English", 85);
		subs[2] = new Subject("003", "Science", 60);
		
		for(Subject s: subs) {
			System.out.println(s);
		}
	}
}
