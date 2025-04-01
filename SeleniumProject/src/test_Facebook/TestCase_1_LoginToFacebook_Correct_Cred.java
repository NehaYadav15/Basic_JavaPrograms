package test_Facebook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source_Facebook.Login_Page;

public class TestCase_1_LoginToFacebook_Correct_Cred 
{
	@Test
	public void loginWithCorrectCred()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.un();
		loginpage.pwd();
		loginpage.login();
	}

}
