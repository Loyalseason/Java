package Practice;

class Rectangle{
	int length;
	int breadth;
	Rectangle(){
		length=breadth=1; 
	}
	Rectangle(int l, int b){
		length = l;
		breadth = b;
	}
}

class Cuboid extends Rectangle{
	int height;
	Cuboid(){
		height = 1;
	}
	Cuboid(int h){
		height = h;
	}
	Cuboid(int l, int h, int b){
		super(l, h);
		height = h;
	}
	
	public int volume() {
		return length * breadth * height;
	}
}

public final class InheritanceAndConstructors {

	public static void main(String[] args) {
	
		Cuboid c = new Cuboid(10);
		Rectangle c1 = new Cuboid(10);
 		System.out.println(c1.length);

	}

}
