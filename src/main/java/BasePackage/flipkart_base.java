package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_base {
    public static WebDriver driver;
	public flipkart_base()
	{
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayavel\\Desktop\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
	}
	public void textbox(WebElement location,String a)
	{
		location.sendKeys(a);
	}
	public void title()
	{
		System.out.println(driver.getTitle());
	}
}
