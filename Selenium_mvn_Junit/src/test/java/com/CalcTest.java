package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
		
	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int actual =  c.add(10, 20);
		int expected = 30;	
		assertEquals(expected, actual);
	}
	
	@Test
	public void squareTest()
	{
		Calc c = new Calc();
		int actual = c.square(10);
		int expected = 100;
		assertEquals(expected, actual);
	}
	
	
}
