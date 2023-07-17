package Practice;

public class MethodOverloading {
  
    
	static double Area(int length, int breadth) {
		double area = length * breadth;
		return area;
	}
	
	static double Area(int radius) {
		double area = Math.PI * Math.sqrt(radius);
		return area;
	}
	
	public static void main(String[] Args) {
		int l = 10, b = 5, r = 3;
		
		System.out.println(Area(l, b));
		System.out.println(Area(r));
		
	}
}
