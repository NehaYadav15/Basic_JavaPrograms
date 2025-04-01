package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_Login {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://spcentral.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fspcentral.amazon.in%2F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_spc_desktop_in&openid.mode=checkid_setup&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=amzn_spc_desktop_in&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("ap_email"));
		e1.sendKeys("9583495508");
		WebElement e2=driver.findElement(By.id("continue"));
		e2.click();
		//Thread.sleep(3000);
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys("Amazon12");
		WebElement e4=driver.findElement(By.id("signInSubmit"));
		e4.click();
		//driver.close();
        
	}

}
