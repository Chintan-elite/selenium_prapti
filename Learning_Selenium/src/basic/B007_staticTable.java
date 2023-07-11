package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B007_staticTable {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = DriverConnection.connect("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		
		WebElement data =  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]"));
		System.out.println(data.getText());
		
		
		
	}
}
