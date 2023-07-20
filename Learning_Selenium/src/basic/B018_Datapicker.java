package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B018_Datapicker {
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/datepicker/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		WebElement datep =  driver.findElement(By.id("datepicker"));
		
		datep.click();
		
		String myYear = "2022";
		String myMonth ="June";
		String myDate = "13";
		
		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		int a = Integer.parseInt(myYear);
		int b = Integer.parseInt(currentYear);
		
		if(a<b)
		{
			while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear))
			{
				driver.findElement(By.xpath("//a[@title='Prev']/span")).click();
			}
			

			while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
			{
				driver.findElement(By.xpath("//a[@title='Prev']/span")).click();
			}
		}
		else
		{
		
		while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear))
		{
			driver.findElement(By.xpath("//a[@title='Next']/span")).click();
		}
		

		while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
		{
			driver.findElement(By.xpath("//a[@title='Next']/span")).click();
		}
		
		}
		
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement date : allDates)
		{
			if(date.getText().equals(myDate))
			{
				date.click();
				break;
			}
		}
		
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		
		
		
		
		
		
		
	}
}
