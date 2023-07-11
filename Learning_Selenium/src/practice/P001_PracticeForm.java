package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverConnection;

public class P001_PracticeForm {
	public static void main(String[] args) {
		
	 WebDriver driver = DriverConnection.connect("https://www.techlistic.com/p/selenium-practice-form.html");
	
	 driver.findElement(By.name("firstname")).sendKeys("test");
	 driver.findElement(By.name("lastname")).sendKeys("test");
	 
	 List<WebElement> gender = driver.findElements(By.name("sex"));
	 gender.get(1).click();
	 
	 List<WebElement> exp = driver.findElements(By.name("exp"));
	 exp.get(4).click();
	 
	 
	 driver.findElement(By.id("datepicker")).sendKeys("06/07/2023");
	 
	 List<WebElement> pro = driver.findElements(By.name("profession"));
	 pro.get(0).click();
	 pro.get(1).click();
	 
	 
	 List<WebElement> tool = driver.findElements(By.name("tool"));
	 tool.get(0).click();
	 tool.get(2).click();
	 
	 
	 WebElement cont = driver.findElement(By.id("continents"));
	 Select conts = new Select(cont);
	 conts.selectByVisibleText("Africa");
	 
	 
	 WebElement command = driver.findElement(By.id("selenium_commands"));
	 Select commands = new Select(command);
	 commands.selectByVisibleText("Switch Commands");
	 commands.selectByVisibleText("Wait Commands");
	 
	 driver.findElement(By.id("photo")).sendKeys("C:\\Users\\CHINTAN\\Downloads\\selenium-logo.png");
	 
	 
	 
	 
	
	 
	 
	 
	}
	
	
}
