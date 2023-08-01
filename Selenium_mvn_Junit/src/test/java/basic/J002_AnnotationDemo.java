package basic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class J002_AnnotationDemo {
	
	@Test
	public void alpha()
	{
		System.out.println("Running alpha test");
	}
	
	@Ignore
	@Test
	public void beta()
	{
		System.out.println("Running beta test");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("This will run before every test");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("Running after evry test");
	}

	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("This will run before all test");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("This will run run after all test");
	}
	
}
