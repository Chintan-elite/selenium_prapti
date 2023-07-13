package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class B008_Dynamictable {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
//		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//		
//		
//		List<WebElement> head = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
//		for(WebElement h : head)
//		{
//			System.out.print(h.getText()+" ");
//		}
//		System.out.println();
//		
//		for(int i=2;i<=rows.size();i++)
//		{
//			
//			
//			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
//			for(WebElement col : cols)
//			{
//				System.out.print(col.getText()+" ");
//			}
//			System.out.println();
//		}
		
		List<WebElement> head = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		for(WebElement h : head)
		{
			System.out.print(h.getText()+" ");
		}
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));		
		for(WebElement row : rows)
		{
			System.out.println(row.getText());
		}
		
	}
	
	
}
