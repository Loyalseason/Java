package Practice;

class Parent{
	public void display() {
		System.out.println("First View");
	}
}

class Child extends Parent{
	@Override
	public void display() {
		System.out.println("Here i have overided");
	}
}
public class MethodOveriding {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.display();
		
		Child c =  new Child();
		c.display();
	}
}
