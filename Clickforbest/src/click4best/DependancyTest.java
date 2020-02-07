package webpack;

import org.testng.annotations.Test;

public class DependancyTest {
	@Test
	public void meth1()
	{
		int x=10,y=100;
		System.out.println("This is meth1() code");
		int z=x/y;
		System.out.println("z="+z);
	}
	
	@Test(dependsOnMethods={"meth1"})
	public void meth2()
	{
		System.out.println("This is meth2() code");
	}
	

}
