package explicitWait_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
    	driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Google"));
		WebElement e1=driver.findElement(By.xpath("(//div[@class='gb_J gb_cd gb_0'])"));
    	e1.click();
    	wait.until(ExpectedConditions.urlToBe("https://www.google.com/"));
        wait.until(ExpectedConditions.urlContains("google"));
	}

}
