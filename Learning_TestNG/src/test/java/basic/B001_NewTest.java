package basic;

import org.testng.annotations.Test;

public class B001_NewTest {
	
	@Test(priority = 3)
	public void test()
	{
		System.out.println("Running test 1");
	}
	
	@Test(priority = 2,enabled = false)
	public void alpha()
	{
		System.out.println("Running alpha test");
	}
	
	@Test(priority = 1)
	public void beta()
	{
		System.out.println("Running beta test");
	}
	
	
	
}
