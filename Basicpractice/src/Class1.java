
public class Class1 {
	
	//Static / Non static method
	
	public static void main(String args[]) throws Exception {
		
		System.out.println("new");
		
		dew();
		
		Class1 kite = new Class1();
		
		kite.say();
	}
	
	public static void dew() throws Exception {
		
		System.out.println("old");
	}
	
	public void say() throws Exception{
		
		System.out.println("mid");
	}

}
