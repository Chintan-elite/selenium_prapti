package basic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class J003_Assertion {
	 
	@Test
	public void test()
	{
		int a = 10;
		int b = 20;
		
		
		//assertEquals(b, a);
		//assertEquals("java", "java");
		
		//assertTrue(a<b);
		
		//assertFalse(a>b);
		
		//assertNull(a);
		
		//assertNotNull(a);
		
		int i[] = {10,20,30,40,50,60};
		int j[] = {10,20,30,70,50,60};
		
		assertArrayEquals(i, j);
		
		
	}
}
