package Practice;

class coffeeMachine{
	float waterQty;
	float sugarQty;
	static private coffeeMachine my =  null;
	private coffeeMachine(){
		waterQty = 1;
		sugarQty = 1;
	}
	
	public void sugarQty(float sugarQty) {
		 sugarQty = this.sugarQty;
	}
	static coffeeMachine getInstance() {
		if (my == null)
			my = new coffeeMachine();
		return my;
	}
	
}
public class SingletonClass {

	public static void main(String[] Args) {
		coffeeMachine c = coffeeMachine.getInstance();
		c.sugarQty(54.55f);
		}
}
