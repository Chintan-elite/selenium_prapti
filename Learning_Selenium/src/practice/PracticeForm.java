package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.DriverConnection;

public class PracticeForm {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
		
		
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9874859685");
		
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		String myyear = "2000";
		String mymonth = "May";
		String mydate = "30";
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(mymonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myyear);
		
		
		List<WebElement> days = driver.findElements(By.xpath("//div[@class='react-datepicker__week']/div"));
		for(WebElement day : days)
		{
			if(day.getText().equals(mydate))
			{
				if(day.getAttribute("aria-label").contains(mymonth))
				{
					day.click();
					break;
				}
			}
		}
		
		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		
		Actions builder = new Actions(driver);
		
		builder.click(subject)
				.sendKeys("Maths")
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.sendKeys("Physics")
				.sendKeys(Keys.ARROW_DOWN)
				.pause(Duration.ofSeconds(5))
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("D:\\test\\sell.png");
		
		driver.findElement(By.id("currentAddress")).sendKeys("surst,gujarat");
		
		
		
		
		
		
		
		
		
		
		
	}
}
