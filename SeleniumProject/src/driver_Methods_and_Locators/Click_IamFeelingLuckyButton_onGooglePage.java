package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Click_IamFeelingLuckyButton_onGooglePage {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
    	driver.get("https://www.google.com/");
		//Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
    	element.click();

	}

}
