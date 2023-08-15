package Practice;

class Product{
	private static int totalItems = 0;
	int itemNo;
	String name;
	double price;
	int qty;
	
	Product(String name, double price, int qty){
		this.name = name;
		this.price = price;
		this.qty = qty;
		 
		totalItems++;  
		itemNo = totalItems;
	}
	

	public String setName(){
		return name;
	}
	
	public void getName(){
		System.out.println(name);
	}
	
	public double setPrice(){
		return price;
	}
	
	public void getPrice(){
		System.out.println(price);
	}
	
	public int setQty(){
		return qty;
	}
	
	public double total() {
		return price * qty;
	}
	public String showData() {
		return "\nItemNo: " +  itemNo + "\nItem Name: " + name + "\nItem Price: " + price + "\nItem Qty: " + qty + "\nTotal: "+ total();
	}
}

public class Product_Customer {

	public static void main(String []Args) {
		Product p1 = new Product("Milk", 5.7, 5);
		
		    System.out.println("Name: " + p1.setName());
	        System.out.println("Price: " + p1.setPrice());
	        System.out.println("Quantity: " + p1.setQty());
	        System.out.println("Total: " + p1.total());
	        
	        System.out.println(p1.showData());
	        System.out.println();
			Product p2 = new Product("Coke", 5.7, 5);
			
		    System.out.println("Name: " + p2.setName());
	        System.out.println("Price: " + p2.setPrice());
	        System.out.println("Quantity: " + p2.setQty());
	        System.out.println("Total: " + p2.total());
	        
	        System.out.println(p2.showData());
		
		
	}


}
