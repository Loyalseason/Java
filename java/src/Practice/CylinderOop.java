package Practice;

class Cylinder{
	public double radius;
	public double height;
	
//	Cylinder(float radius,float height){
//		radius = this.radius;
//		height = this.height;
//	}
	
	public void getRadius(){
	 System.out.println("Radius : " + radius);
	}
	
	public void getHeight() {
	 System.out.println("Height : " + height);
	}
	public void setRadius(double radius){
		 this.radius = radius;
		}
		
		public void setHeight(double height) {
		  this.height = height;
		}
	public void setDimensions(double radius, double height){
          this.radius = radius;
          this.height = height;
	}
	public String getDimensions(){
           return "Radius : " + radius + "\nHeight " + height;
	}
}
public class CylinderOop {

	public static void main(String []Args) {
		
		Cylinder c1 = new Cylinder();
		c1.height = 25;
		c1.radius = 3;
		
		c1.getRadius();
		c1.getHeight();
		System.out.println();
		c1.setHeight(5);
		c1.setRadius(12);
		c1.getHeight();
		c1.getRadius();
		System.out.println();
		c1.setDimensions(23.7, 25.6);
		System.out.println(c1.getDimensions());
		
		
		
		
	}
}
