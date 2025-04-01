package handle_Navigation_Panel;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigating_toGoogle_usingNavigation_Methods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/"); // Used for String url
		
		//URL u1=new URL("https://google.com/"); //Used for broken links
		//driver.navigate().to(u1);

		//Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}

}
