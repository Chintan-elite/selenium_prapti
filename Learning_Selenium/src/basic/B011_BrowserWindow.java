package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class B011_BrowserWindow {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/browser-windows");
		
	    String mainWin= driver.getWindowHandle();
		//System.out.println(mainWin);
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> wins =  driver.getWindowHandles();
		
		for(String win : wins)
		{
			if(win!=mainWin)
			{
				driver.switchTo().window(win);
			}
		}
		
		
		String data =  driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(data);
		
//		driver.close();
//		driver.switchTo().window(mainWin);
//		driver.close();
		
		driver.quit();
		
	}
}
