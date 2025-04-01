package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Product_on_Flipkart {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/?gad_source=1&gclid=EAIaIQobChMIqt-m7ITPiwMVCKRmAh19RjhMEAAYASAAEgIq4fD_BwE");
        driver.manage().window().maximize();
        WebElement e1=driver.findElement(By.name("q"));
        e1.sendKeys("Mobiles"+Keys.ENTER);
        
	}

}
