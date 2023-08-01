package com;

import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

@RunWith(Parameterized.class)
public class LoginTest {

	String userEmail;
	String userPass;
	static WebDriver driver;
	public LoginTest(String userEmail, String userPass) {
		super();
		this.userEmail = userEmail;
		this.userPass = userPass;
	}
	
	@BeforeClass
	public static void setUp()
	{
		driver = DriverConnection.connect("https://www.fb.com");
		
	}
	
	@AfterClass
	public static void close()
	{
		driver.quit();
	}
	
	@Test
	public void fbLogin() throws InterruptedException
	{
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
	
		email.clear();
		email.sendKeys(userEmail);
		pass.clear();
		pass.sendKeys(userPass);
		login.click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
	}
	
	@Parameters
	public static List<Object[]> getData()
	{
		Object obj[][] = new Object[4][2];
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test";
		
		obj[1][0] = "tech@gmail.com";
		obj[1][1] = "tech";
		
		obj[2][0] = "abc@gmail.com";
		obj[2][1] = "abc";
		
		obj[3][0] = "xyz@gmail.com";
		obj[3][1] = "xyz";
		
		return Arrays.asList(obj);
		
	}
}
