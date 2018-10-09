package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1Test {
	@Test
	public void sum()
	{
		System.out.println("sum");
		int a =20;
		int b = 10;
		Assert.assertEquals(30, a+b);
	}

	@Test
	public void minus()
	{
		System.out.println("minus");
		int a =20;
		int b =10;
		Assert.assertEquals(10, a-b);
	}

}
