package Practice;

class Circle{
	
	// Properties
	double radius;
	 
	
	
	// Methods
	double area(){
	   double area = Math.PI * Math.sqrt(radius);
	   return area;
	}
	
	double perimeter(){
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	double circumference() {
		return perimeter();
	}
}


public class CircleClassOop {

	public static void main(String[] args) {
		
		Circle c = new Circle();

		c.radius = 5.9;
	
		System.out.println(c.area());
		System.out.println(c.perimeter());
		System.out.println(c.circumference());

		
	}
	
}
