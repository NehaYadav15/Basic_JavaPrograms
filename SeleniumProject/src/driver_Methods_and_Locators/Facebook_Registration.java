package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook_Registration {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804932%7Cb%7Cfacebook%20registration%7C&placement=&creative=550525804932&keyword=facebook%20registration&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-300840385888%26loc_physical_ms%3D9185858%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=EAIaIQobChMInrH8nYLPiwMVv6lmAh38hTv4EAAYASAAEgIo2PD_BwE");
        driver.manage().window().maximize();
        WebElement e1=driver.findElement(By.name("firstname"));
        e1.sendKeys("Neha");
        WebElement e2=driver.findElement(By.name("lastname"));
        e2.sendKeys("Yadav");
        WebElement e3=driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[1]"));
        e3.click();
        WebElement e4=driver.findElement(By.name("reg_email__"));
        e4.sendKeys("9583495508");
        WebElement e5=driver.findElement(By.id("password_step_input"));
        e5.sendKeys("12345678");
        WebElement e6=driver.findElement(By.name("websubmit"));
        e6.click();

	}

}
