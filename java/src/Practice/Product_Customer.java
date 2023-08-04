package Practice;

class Product{
	int itemNo = 0;
	String name;
	double price;
	int qty;
	
	Product(String name, double price, int qty){
		this.name = name;
		this.price = price;
		this.qty = qty;
		
		itemNo++;  
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
		
	}


}
