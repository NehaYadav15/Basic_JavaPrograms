package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_and_Partial_Link_Text_Locators {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement gmail_link=driver.findElement(By.linkText("Gmail"));
		gmail_link.click();
		//WebElement gmail_link1=driver.findElement(By.partialLinkText("Gma"));
        //gmail_link1.click();
        driver.close();
	}

}
