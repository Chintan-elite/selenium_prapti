package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B016_Scroll {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.amazon.in/");
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,600)");
		
		
//		WebElement link = driver.findElement(By.linkText("End of season sale"));
//		js.executeScript("arguments[0].scrollIntoView();", link);
	
		
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
	}
}
