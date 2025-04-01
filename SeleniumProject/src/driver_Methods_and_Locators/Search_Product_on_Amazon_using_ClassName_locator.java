package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Product_on_Amazon_using_ClassName_locator {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        //Thread.sleep(3000);
        WebElement e1=driver.findElement(By.className("nav-input nav-progressive-attribute"));
        e1.sendKeys("Watches"+Keys.ENTER);
        
	}

}
