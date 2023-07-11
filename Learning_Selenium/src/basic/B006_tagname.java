package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	
import util.DriverConnection;

public class B006_tagname {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.facebook.com/");
		
//		List<WebElement> div = driver.findElements(By.tagName("div"));
//		System.out.println(div.size());
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
		
		
	}
}
