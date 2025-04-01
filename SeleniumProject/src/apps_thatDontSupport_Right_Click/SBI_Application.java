package apps_thatDontSupport_Right_Click;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_Application {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();
		WebElement e2=driver.findElement(By.name("userName"));
		e2.sendKeys("Neha15");
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys("12345678");
		Thread.sleep(1000);
		WebElement e4=driver.findElement(By.id("loginCaptchaValue"));
		e4.sendKeys("KLgf45");
		Thread.sleep(1000);
		WebElement e5=driver.findElement(By.name("optionOfCaptcha"));
		e5.click();
		Thread.sleep(1000);
		WebElement e6=driver.findElement(By.id("Button2"));
		//e6.sendKeys(Keys.ENTER);
	}

}
