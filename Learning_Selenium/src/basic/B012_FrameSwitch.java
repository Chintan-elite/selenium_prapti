package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B012_FrameSwitch {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/frames");
		
		
//		List<WebElement> frames =  driver.findElements(By.tagName("iframe"));
//		System.out.println(frames.size());
		
		WebElement frame = driver.findElement(By.id("frame1"));
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("framename");
		driver.switchTo().frame(frame);
		
		String data = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(data);
		
		
		
		
		
	}
}
