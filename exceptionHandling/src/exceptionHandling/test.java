package exceptionHandling;

public class test {

	public static void main(String args[]) throws Exception{
		
		
		try{
			int a = 10; int b = 7;
			
			int c = b/a;
			System.out.println("try block executed");
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("finally executed");
		}
	}
	
}
