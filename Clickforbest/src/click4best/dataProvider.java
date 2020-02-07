package webpack;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataProvider {
	double total = 1;
	@Test
	@Parameters("sum")
	
	public void test(int sum)
	{
		System.out.println("The given value is "+sum);
		
		
		
		for(int i=sum;i>=1;i--)
		{
			
			total=total*i;
			
			System.out.println("The total value is  "+total);
		}
	System.out.println("The given total value is  "+total);
	}
	
	
	
}