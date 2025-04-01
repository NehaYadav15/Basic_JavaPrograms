package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotechminds_Registeration {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.id("firstName"));
		e1.sendKeys("Neha");
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.name("lastName"));
		e2.sendKeys("Yadav");
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.name("email"));
		e3.sendKeys("nehavns21@gmail.com");
		Thread.sleep(3000);
		WebElement e4=driver.findElement(By.name("phone"));
		e4.sendKeys("9583495508");
		Thread.sleep(3000);
		WebElement e5=driver.findElement(By.id("aadhaar"));
		e5.sendKeys("432463759607987865");
		Thread.sleep(3000);
		WebElement e6=driver.findElement(By.id("pan"));
		e6.sendKeys("887655435890987987");
		Thread.sleep(3000);
		WebElement e7=driver.findElement(By.name("terms"));
		e7.click();
		Thread.sleep(3000);
		WebElement e8=driver.findElement(By.name("Submit"));
		e8.click();

	}

}
