package Practice;




class Circle2
{
    public double radius;
    
    public double area()
    {
        return Math.PI * radius *radius;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}

class Cylinder2 extends Circle2
{
    public double height;
    
    public double volume()
    {
        return area()*height;
    }
    
}
public class Inheritance {
	
    public static void main(String[] args) 
    {
        Cylinder2 c=new Cylinder2();
       
        c.radius=7;
        c.height=10;
        
        System.out.println("Volume "+c.volume());
        System.out.println("Area "+c.area());
       
    }
}








