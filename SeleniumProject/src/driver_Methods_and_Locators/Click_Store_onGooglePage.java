package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Store_onGooglePage 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	ChromeDriver driver=new ChromeDriver();
    	driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("Store"));
    	e1.click();
	}
}
