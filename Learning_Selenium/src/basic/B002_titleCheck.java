package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B002_titleCheck {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String expectedTilte = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		
		if(expectedTilte.equals(actualTitle))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
		driver.close();
	}
}
