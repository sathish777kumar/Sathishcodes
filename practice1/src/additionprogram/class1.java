package additionprogram;

public class class1 {
	
	public static void main(String args[]) throws Exception {
		
		int g= add(7,8);
		
		if (g>10) {
			
			System.out.println("return success");
		}
		
		add(54,17);
		
		
	}
		
	public static int add (int a, int b) throws Exception {
		
int c;
		
		c=a+b;
		
		System.out.println(c);
		
		return c;
		
		
	}

}
