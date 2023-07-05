package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B004_FBSignUP {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		driver.findElement(By.name("reg_email__")).sendKeys("9885748596");
		driver.findElement(By.name("reg_passwd__")).sendKeys("tech@1234");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("10");
		//days.selectByIndex(9);
		//days.selectByValue(10);
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("4");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(10);
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		//System.out.println(gender.size());
		gender.get(1).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
