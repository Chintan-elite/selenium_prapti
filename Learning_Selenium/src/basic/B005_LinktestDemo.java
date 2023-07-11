package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B005_LinktestDemo {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.facebook.com/");
		
		
		//driver.findElement(By.linkText("Create a Page")).click();
		
		List<WebElement> links =  driver.findElements(By.partialLinkText("Create"));
		//System.out.println(links.size());
//		
//		for(WebElement link : links)
//		{
//			System.out.println(link.getText());
//		}
		
		links.get(2).click();
		
	}
}
