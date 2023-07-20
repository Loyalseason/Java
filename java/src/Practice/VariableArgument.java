package Practice;

public class VariableArgument {
   
//	static void show(int ...A) {
//		for(int x : A) {
//			System.out.println(x);
//		}
//	}
	
	static void showList(String ...S) {
		for(int i=0; i< S.length; i++) {
			System.out.println(i + 1 + ". " + S[i]);
		}
	}
	
	
	public static void main(String[] args) {
//		show();
//		show(5, 10, 30);
//		show(new int[] {5, 10, 30});
		
		
		showList("John", "Smith", "Ama");
	}
}
