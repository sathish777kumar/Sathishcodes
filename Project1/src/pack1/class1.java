package pack1;

public class class1 {
	
	public static void main (String args[])throws Exception {

		int f = test(54,7);
		
		if (f>100) {
			
			System.out.println("okay");
		}
		
		else {
			
			System.out.println("NOT okay");
		}

}

	public static int test(int a, int b) throws Exception {
		
		
		int c=a+b;
		
		System.out.println(c);
		
		return c;
	}
}