package webpack;

import org.testng.annotations.*;

public class GroupTest1 {
	
	
	
	@Test(alwaysRun=true)
	public void meth1()
	{
		System.out.println("meth1() in GroupTest1 ");
	}

	
	
	
	@Test(groups="low")
	public void meth2()
	{
		System.out.println("meth2() in GroupTest1 ");
	}
	
	
	
	@Test(groups={"critical","high"})
	public void meth3()	{
		System.out.println("meth3() in GroupTest1 ");
	}
	
	
	
	
	@Test(groups="G2")
	public void meth4()
	{
		System.out.println("meth4() in GroupTest1 ");
	}
	
}
