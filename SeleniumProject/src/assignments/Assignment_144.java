package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_144 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/about/");
		Thread.sleep(6000);
		//driver.close();
		driver.quit();

	}

}
