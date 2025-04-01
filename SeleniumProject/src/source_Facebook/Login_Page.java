package source_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	WebDriver driver;
   //Step-1
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginbutton;
	
	//Step-2
	public void un()
	{
		username.sendKeys("nehavns21@gmail.com");
	}
	public void pwd()
	{
		password.sendKeys("12345678");
	}
	public void login()
	{
		loginbutton.click();
	}
	
	//Step-3
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
