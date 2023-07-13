package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class B013_NestedFrame {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/nestedframes");
		
		
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		
		driver.switchTo().frame(0);
		
		String data =  driver.findElement(By.tagName("p")).getText();
		System.out.println(data);
		
		
	}
}
