package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B001_BrowserDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		//open browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//opne web
		driver.get("https://www.facebook.com/");
		
		
		//fullscreen
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		//close window
		driver.close();   //for single window
		//driver.quit();  //for allwindow/browser
		
		
	}
}
