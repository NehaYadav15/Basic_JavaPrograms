package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook_Login {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://en-gb.facebook.com/login/web/");
        driver.manage().window().maximize();
        WebElement e1=driver.findElement(By.id("email"));
        e1.sendKeys("nehavns21@gmail.com");
        WebElement e2=driver.findElement(By.id("pass"));
        e2.sendKeys("1234567");
        WebElement e3=driver.findElement(By.name("login"));
        e3.click();

	}

}
