package driver_Methods_and_Locators;

import org.openqa.selenium.edge.EdgeDriver;

public class Close_and_Quit_Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        Thread.sleep(5000);
        driver.close();

	}

}
