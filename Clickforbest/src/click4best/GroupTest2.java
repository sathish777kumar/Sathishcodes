package webpack;

import org.testng.annotations.Test;

public class GroupTest2 {
	
	
	@Test
	public void meth1()
	{
		System.out.println("meth1() in GroupTest2 ");
	}

	@Test(groups="Critical")
	public void meth2()
	{
		System.out.println("meth2() in GroupTest2 ");
	}
	@Test(groups="high")
	public void meth3()	{
		System.out.println("meth3() in GroupTest2 ");
	}
	@Test(groups="low")
	public void meth4()
	{
		System.out.println("meth4() in GroupTest2 ");
	}
	
}
