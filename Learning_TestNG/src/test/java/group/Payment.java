package group;

import org.testng.annotations.Test;

public class Payment {

	@Test(groups = "sanity")
	public void creditCardTest()
	{
		System.out.println("Running creditcard Test");
	}
	
	@Test(groups = {"smoke","sanity"})
	public void debetCardTest()
	{
		System.out.println("Runnig debetcard Test");
	}
	
	@Test(groups = "smoke")
	public void cod()
	{
		System.out.println("Running cod Test");
	}
}
