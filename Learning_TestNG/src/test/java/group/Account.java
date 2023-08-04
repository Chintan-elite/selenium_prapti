package group;

import org.testng.annotations.Test;

public class Account {
	
	@Test(groups = "sanity")
	public void savingAccount()
	{
		System.out.println("Running saving account");
	}
	
	@Test(groups = "smoke")
	public void loanAccount()
	{
		System.out.println("Running loan account");
	}
	
	@Test(groups = "smoke")
	public void currentAccount()
	{
		System.out.println("Runing loan account");
	}
}
