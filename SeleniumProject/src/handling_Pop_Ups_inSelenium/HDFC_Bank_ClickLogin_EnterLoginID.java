package handling_Pop_Ups_inSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HDFC_Bank_ClickLogin_EnterLoginID {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.switchTo().alert().dismiss();
		
		WebElement e1=driver.findElement(By.className("desktop-login position-find btn btn-primary login-btn hide-in-mobileApp ng-scope"));
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ENTER);
		
		Set<String> pcid=driver.getWindowHandles();
        System.out.println(pcid);
        //driver.close();
        Iterator<String> i2=pcid.iterator();
        String pid=i2.next();
        String cid=i2.next();
        System.out.println(pid);
        System.out.println(cid);
        driver.switchTo().window(cid);
		
		WebElement e2=driver.findElement(By.xpath("(//input[@class='form-control text-muted'])[1]"));
		e2.sendKeys("neha1234");
	}

}
