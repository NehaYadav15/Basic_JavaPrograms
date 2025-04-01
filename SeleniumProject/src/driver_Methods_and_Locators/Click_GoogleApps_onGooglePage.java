package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_GoogleApps_onGooglePage {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
    	driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//div[@class='gb_J gb_cd gb_0'])"));
    	e1.click();

	}

}
