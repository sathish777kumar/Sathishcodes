package Exceptionhandling;

public class class1 {
	
	public static void main (String args[]) throws Exception {
		
		try {
		
		int a=0;
		
		int b=7;
		
		int c=a/b;
		
		System.out.println(c);
		
		System.out.println("try block executed");
		
		}
		
		catch (Exception r){
			
			System.out.println("denomiator is 0");
			
			System.out.println("catch block executed");
		}
		
		finally {
			
			System.out.println("any one block executed");
		}
	}

}
