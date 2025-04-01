package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotechminds_Registeration_SubmitButton_using_ClassName_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.className("btn btn-primary"));
		e1.sendKeys(Keys.ENTER);

	}

}
