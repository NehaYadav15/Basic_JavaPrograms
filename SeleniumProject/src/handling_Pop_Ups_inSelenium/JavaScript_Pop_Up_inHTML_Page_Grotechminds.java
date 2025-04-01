package handling_Pop_Ups_inSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Pop_Up_inHTML_Page_Grotechminds {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nehav/OneDrive/Desktop/Document.imp/learningHTML1.html");
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.manage().window().maximize();

	}

}
