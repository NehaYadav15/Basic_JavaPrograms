package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_Pass_SRK_using_Classname_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.className("gLFyf"));
		e1.sendKeys("SRK"+Keys.ENTER);
		Thread.sleep(5000);
		driver.close();

	}

}
