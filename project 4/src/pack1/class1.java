package pack1;

public class class1 {
	
	public static void main (String args[])throws Exception {
		
		int j = add(53,25);
		
		if (j>=35 && j<=40) {
			
			System.out.println("just pass");
		}
		
		else if (j>40 && j<=60) {
			
			System.out.println("pass");
		}
		
		
		else if (j>60 && j<=80) {
			
			System.out.println("first class");
		}
		
		else if (j>80) {
			
			System.out.println("Distinction");
		}
		
		else {
			
			System.out.println("fail");
		}
	}
	
	public static int add(int a, int b) throws Exception {
		
		int c=a+b;
		
		System.out.println(c);
		
		return c;
		
	}

}
