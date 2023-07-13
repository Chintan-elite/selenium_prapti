package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B009_TableHandling {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/webtables");
		
		String name = "Cierra";
		
		
		
		try {
			WebElement data = driver.findElement(By.xpath("//*[text()='"+name+"']"));
			
			if(data.isDisplayed())
			{
				
				driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
				
				
			}
		} catch (Exception e) {
			System.out.println("Name not found !!!");
		}
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
