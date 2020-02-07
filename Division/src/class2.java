
public class class2 {
	
	public static void main (String args[]) throws Exception {
		
		System.out.println("static method executed");
		
		class2 obj = new class2();
		
		obj.tes();
	}

	
	public  void tes() throws Exception {
		
		System.out.println("Non-static method executed");
		
		
	}
}
