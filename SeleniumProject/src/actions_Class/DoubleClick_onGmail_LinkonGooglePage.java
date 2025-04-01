package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_onGmail_LinkonGooglePage {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(driver);
		a1.doubleClick(e1).perform();

	}

}
